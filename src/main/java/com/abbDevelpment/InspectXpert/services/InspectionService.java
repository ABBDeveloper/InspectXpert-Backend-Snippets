package com.abbDevelpment.InspectXpert.services;

import com.abbDevelpment.InspectXpert.model.Inspection;
import com.abbDevelpment.InspectXpert.model.InspectionSummaryDTO;
import com.abbDevelpment.InspectXpert.repository.InspectionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class InspectionService {
    @Autowired
    private final InspectionRepository inspectionRepository;

    public InspectionService(InspectionRepository inspectionRepository) {
        this.inspectionRepository = inspectionRepository;
    }

    public Inspection saveInspection(Inspection inspection) {
        if (inspection == null) {
            throw new IllegalArgumentException("Inspection cannot be null");
        }
        return inspectionRepository.save(inspection);
    }

    public List<InspectionSummaryDTO> findAllInspectionSummaries() {
        return this.inspectionRepository.findInspectionSummaries();
    }

    public Optional<Inspection> findInspectionById(Long inspectionId) {
        return this.inspectionRepository.findById(inspectionId);
    }

    public Inspection updateInspectionById(Long inspectionId, Inspection updatedInspection) {
        Inspection inspection = this.inspectionRepository.findById(inspectionId)
                .orElseThrow(() -> new EntityNotFoundException("Inspection not found with id " + updatedInspection.getId()));
        updatedInspection.setId(inspectionId);
        return this.inspectionRepository.save(updatedInspection);
    }

    public void deleteInspectionById(Long inspectionId) {
        this.inspectionRepository.deleteById(inspectionId);
    }
}