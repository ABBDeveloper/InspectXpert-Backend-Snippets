package com.abbDevelpment.InspectXpert.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inspection_photo_link")
public class InspectionPhotoLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "inspection_id")
    private Inspection inspection;

    @Column(name = "photo_url")
    private String photoUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInspection(Inspection inspection) {
        this.inspection = inspection;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}