package com.example.connectadocaoapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity

public class AnimalPhotos implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String photo_url;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;
}
