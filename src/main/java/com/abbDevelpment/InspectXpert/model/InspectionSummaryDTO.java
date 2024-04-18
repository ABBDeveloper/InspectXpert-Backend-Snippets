package com.abbDevelpment.InspectXpert.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class InspectionSummaryDTO {
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDateTime inspectionDate;
    private String inspector;
    private String manufacturer;
    private String model;
    private Integer constructionYear;
    private String licensePlate;
    private String chassisNumber;
    private Integer mileage;
    private String thumbnail;

    public InspectionSummaryDTO(Long id, LocalDateTime inspectionDate, String inspector, String manufacturer, String model, Integer constructionYear, String licensePlate, String chassisNumber, Integer mileage, String thumbnail) {
        this.id = id;
        this.inspectionDate = inspectionDate;
        this.inspector = inspector;
        this.manufacturer = manufacturer;
        this.model = model;
        this.constructionYear = constructionYear;
        this.licensePlate = licensePlate;
        this.chassisNumber = chassisNumber;
        this.mileage = mileage;
        this.thumbnail = thumbnail;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getInspectionDate() {
        return inspectionDate;
    }

    public String getInspector() {
        return inspector;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public Integer getMileage() {
        return mileage;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}