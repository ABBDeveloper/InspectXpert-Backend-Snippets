package com.abbDevelpment.InspectXpert.services;

import com.abbDevelpment.InspectXpert.model.Inspection;
import com.abbDevelpment.InspectXpert.model.InspectionPhotoLink;
import com.abbDevelpment.InspectXpert.repository.InspectionPhotoLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionPhotoService {
    private final InspectionPhotoLinkRepository inspectionPhotoLinkRepository;

    @Autowired
    public InspectionPhotoService(InspectionPhotoLinkRepository inspectionPhotoLinkRepository) {
        this.inspectionPhotoLinkRepository = inspectionPhotoLinkRepository;
    }

    public void saveInspectionPhotos(String[] photos, Inspection currentInspection) {
        for (String photoUrl : photos) {
            InspectionPhotoLink inspectionPhotoLink = new InspectionPhotoLink();
            if (currentInspection != null) {
                inspectionPhotoLink.setInspection(currentInspection);
                inspectionPhotoLink.setPhotoUrl(photoUrl);
                this.inspectionPhotoLinkRepository.save(inspectionPhotoLink);
            }
        }
    }

    public void deleteInspectionPhotos(String[] photoUrls, Long inspectionId) {
        for (String url : photoUrls){
            this.inspectionPhotoLinkRepository.deleteByPhotoUrlAndInspectionId(url, inspectionId);
        }
    }

    public List<InspectionPhotoLink> findAllPhotoUrlsByInspectionId(Long id) {
        return this.inspectionPhotoLinkRepository.findAllByInspectionId(id);
    }
}
