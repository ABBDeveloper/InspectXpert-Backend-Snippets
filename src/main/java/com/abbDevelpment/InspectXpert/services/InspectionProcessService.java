package com.abbDevelpment.InspectXpert.services;

import com.abbDevelpment.InspectXpert.model.*;
import com.abbDevelpment.InspectXpert.repository.InspectionPhotoLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class InspectionProcessService {
    private final InspectionService inspectionService;
    private final InspectionPhotoService inspectionPhotoService;
    private final InspectionPhotoLinkRepository inspectionPhotoLinkRepository;
    private Inspection currentInspection;

    @Autowired
    public InspectionProcessService(
            InspectionService inspectionService,
            InspectionPhotoService inspectionPhotoService,
            InspectionPhotoLinkRepository inspectionPhotoLinkRepository) {
        this.inspectionService = inspectionService;
        this.inspectionPhotoLinkRepository = inspectionPhotoLinkRepository;
        this.inspectionPhotoService = inspectionPhotoService;
    }

    @Transactional
    public void saveInspectionData(InspectionDTO inspectionDto) {
        try {
            Inspection inspection = InspectionEntityDTOMapper.INSTANCE.dtoToEntity(inspectionDto);
            this.currentInspection = this.inspectionService.saveInspection(inspection);
            String[] inspectionPhotos = inspectionDto.getInspectionPhotos();
            if (Objects.nonNull(inspectionPhotos)) {
                this.inspectionPhotoService.saveInspectionPhotos(inspectionPhotos, this.currentInspection);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Transactional(readOnly = true)
    public List<InspectionSummaryDTO> getAllInspections() {
        return this.inspectionService.findAllInspectionSummaries();
    }

    @Transactional(readOnly = true)
    public InspectionDTO getInspectionById(Long inspectionId) {
        Optional<Inspection> inspection = inspectionService.findInspectionById(inspectionId);
        if (inspection.isPresent()) {
            InspectionDTO inspectionDto = InspectionEntityDTOMapper.INSTANCE.entityToDto(inspection.get());
            String[] photoUrls = this.getInspectionPhotoLinks(inspectionId);
            inspectionDto.setInspectionPhotos(photoUrls);
            return inspectionDto;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Inspection with id " + inspectionId + " not found");
        }
    }

    @Transactional(readOnly = true)
    public String[] getInspectionPhotoLinks(Long inspectionId) {
        List<InspectionPhotoLink> allInspectionPhotoLinks = this.inspectionPhotoService.findAllPhotoUrlsByInspectionId(inspectionId);
        List<String> photoUrls = new ArrayList<>();
        for (InspectionPhotoLink inspectionPhotoLink : allInspectionPhotoLinks) {
            photoUrls.add(inspectionPhotoLink.getPhotoUrl());
        }
        return photoUrls.toArray(new String[0]);
    }


    @Transactional
    public void updateInspectionData(Long inspectionId, InspectionDTO updatedInspectionDto) {
        Optional<Inspection> unUpdatedInspection = this.inspectionService.findInspectionById(inspectionId);
        Inspection updatedInspection = InspectionEntityDTOMapper.INSTANCE.dtoToEntity(updatedInspectionDto);
        this.currentInspection = this.inspectionService.updateInspectionById(inspectionId, updatedInspection);

        Set<String> existingPhotoUrls = new HashSet<>(List.of(this.getInspectionPhotoLinks(inspectionId)));
        Set<String> updatedPhotoUrls = new HashSet<>(List.of(updatedInspectionDto.getInspectionPhotos()));

        updateInspectionPhotoLinks(updatedPhotoUrls, existingPhotoUrls);
    }

    @Transactional
    private void updateInspectionPhotoLinks(Set<String> updatedPhotoUrls, Set<String> existingPhotoUrls) {
        // Fotos die hinzugefügt wurden
        Set<String> addedPhotos = new HashSet<>(updatedPhotoUrls);
        addedPhotos.removeAll(existingPhotoUrls);

        //  Fotos die gelöscht wurden
        Set<String> removedPhotos = new HashSet<>(existingPhotoUrls);
        removedPhotos.removeAll(updatedPhotoUrls);

        if (!addedPhotos.isEmpty()) {
            String[] newUrls  = addedPhotos.toArray(new String[0]);
            this.inspectionPhotoService.saveInspectionPhotos(newUrls, this.currentInspection);
            System.out.println("Hinzugefügte Fotos: " + newUrls);
        }
        if (!removedPhotos.isEmpty()) {
            String[] removedUrls = removedPhotos.toArray(new String[0]);
            this.inspectionPhotoService.deleteInspectionPhotos(removedUrls, currentInspection.getId());
            System.out.println("Gelöschte Fotos: " + removedUrls);
        }
    }

    @Transactional
    public void deleteInspectionById(Long inspectionId) {
        Optional<Inspection> inspection = inspectionService.findInspectionById(inspectionId);
        if (inspection.isPresent()) {
            this.inspectionService.deleteInspectionById(inspectionId);
        }
    }
}
