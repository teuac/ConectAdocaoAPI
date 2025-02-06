package com.example.connectadocaoapi.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Animal implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer age;
    private Double weight;
    private Double height;
    private Integer medical_issues;
    private Integer deficiency;



    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<AnimalPhotos> animal_photos = new ArrayList<>();

    @OneToMany(mappedBy = "animal", cascade =  CascadeType.ALL)
    private List<Announcement> announcements = new ArrayList<>();



}
