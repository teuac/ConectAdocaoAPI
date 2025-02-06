package com.example.connectadocaoapi.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Animal() {
    }

    public Animal(String nome, Integer age, Double weight, Double height, Integer medical_issues, Integer deficiency, List<AnimalPhotos> animal_photos, List<Announcement> announcements) {
        this.nome = nome;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.medical_issues = medical_issues;
        this.deficiency = deficiency;
        this.animal_photos = animal_photos;
        this.announcements = announcements;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getMedical_issues() {
        return medical_issues;
    }

    public void setMedical_issues(Integer medical_issues) {
        this.medical_issues = medical_issues;
    }

    public Integer getDeficiency() {
        return deficiency;
    }

    public void setDeficiency(Integer deficiency) {
        this.deficiency = deficiency;
    }

    public List<AnimalPhotos> getAnimal_photos() {
        return animal_photos;
    }

    public void setAnimal_photos(List<AnimalPhotos> animal_photos) {
        this.animal_photos = animal_photos;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id) && Objects.equals(nome, animal.nome) && Objects.equals(age, animal.age) && Objects.equals(weight, animal.weight) && Objects.equals(height, animal.height) && Objects.equals(medical_issues, animal.medical_issues) && Objects.equals(deficiency, animal.deficiency) && Objects.equals(animal_photos, animal.animal_photos) && Objects.equals(announcements, animal.announcements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, age, weight, height, medical_issues, deficiency, animal_photos, announcements);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", medical_issues=" + medical_issues +
                ", deficiency=" + deficiency +
                ", animal_photos=" + animal_photos +
                ", announcements=" + announcements +
                '}';
    }
}
