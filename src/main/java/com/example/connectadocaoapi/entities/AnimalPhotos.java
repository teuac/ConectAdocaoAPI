package com.example.connectadocaoapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

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

    public AnimalPhotos() {
    }

    public AnimalPhotos(String photo_url, Animal animal) {
        this.photo_url = photo_url;
        this.animal = animal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AnimalPhotos that = (AnimalPhotos) o;
        return Objects.equals(id, that.id) && Objects.equals(photo_url, that.photo_url) && Objects.equals(animal, that.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, photo_url, animal);
    }

    @Override
    public String toString() {
        return "AnimalPhotos{" +
                "id=" + id +
                ", photo_url='" + photo_url + '\'' +
                ", animal=" + animal +
                '}';
    }
}
