package com.abbDevelpment.InspectXpert.repository;

import com.abbDevelpment.InspectXpert.model.InspectionPhotoLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InspectionPhotoLinkRepository extends JpaRepository<InspectionPhotoLink, Long> {
    List<InspectionPhotoLink> findAllByInspectionId(Long inspectionId);

    void deleteByPhotoUrlAndInspectionId(String photoUrl, Long inspectionId);
}
