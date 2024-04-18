package com.abbDevelpment.InspectXpert.repository;

import com.abbDevelpment.InspectXpert.model.InspectionSummaryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.abbDevelpment.InspectXpert.model.Inspection;

import java.util.List;

@Repository
public interface InspectionRepository extends JpaRepository<Inspection, Long> {
    @Query("SELECT new com.abbDevelpment.InspectXpert.model.InspectionSummaryDTO(i.id, i.inspectionDate, i.inspector, i.manufacturer, i.model, i.constructionYear, i.licensePlate, i.chassisNumber, i.mileage, i.thumbnail) FROM Inspection i")
    List<InspectionSummaryDTO> findInspectionSummaries();

}