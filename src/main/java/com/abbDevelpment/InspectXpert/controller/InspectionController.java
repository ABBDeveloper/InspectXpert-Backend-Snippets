package com.abbDevelpment.InspectXpert.controller;

import com.abbDevelpment.InspectXpert.model.InspectionDTO;
import com.abbDevelpment.InspectXpert.model.InspectionSummaryDTO;
import com.abbDevelpment.InspectXpert.services.InspectionProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/inspectxpert")
public class InspectionController {

    @Autowired
    private InspectionProcessService inspectionProcessService;

    @PostMapping("/save-inspection")
    public ResponseEntity<String> saveInspection(
            @RequestBody InspectionDTO inspectionDto
    ) throws IOException {
        try {
            this.inspectionProcessService.saveInspectionData(inspectionDto);
            return new ResponseEntity<>("Inspection saved successfully!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to process inspection: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/inspections")
    public ResponseEntity<List<InspectionSummaryDTO>> getAllInspections() {
        List<InspectionSummaryDTO> inspections = this.inspectionProcessService.getAllInspections();
        System.out.println(inspections);
        return ResponseEntity.ok(inspections);
    }

    @GetMapping("/inspection/{inspectionId}")
    public InspectionDTO getInspectionById(@PathVariable Long inspectionId) {
        return this.inspectionProcessService.getInspectionById(inspectionId);
    }

    @PutMapping("update-inspection/{inspectionId}")
    public ResponseEntity<String> updateInspection(
            @PathVariable Long inspectionId,
            @RequestBody InspectionDTO inspectionDto
    ) throws IOException {
        try {
            this.inspectionProcessService.updateInspectionData(inspectionId, inspectionDto);
            return new ResponseEntity<>("Inspection updated successfully!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to process inspection: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/inspection/{inspectionId}")
    public void deleteInspectionById(@PathVariable Long inspectionId) {
        this.inspectionProcessService.deleteInspectionById(inspectionId);
    }
}