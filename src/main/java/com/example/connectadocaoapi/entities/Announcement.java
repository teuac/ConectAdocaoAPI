package com.example.connectadocaoapi.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Announcement implements Serializable {

    private static final Long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Instant post_moment;
    private Integer status;


    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private Users user;

    public Announcement() {
    }

    public Announcement(String title, String description, Instant post_moment, Integer status, Users user, Animal animal) {
        this.title = title;
        this.description = description;
        this.post_moment = post_moment;
        this.status = status;
        this.user = user;
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getPost_moment() {
        return post_moment;
    }

    public void setPost_moment(Instant post_moment) {
        this.post_moment = post_moment;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Announcement that = (Announcement) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(post_moment, that.post_moment) && Objects.equals(status, that.status) && Objects.equals(animal, that.animal) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, post_moment, status, animal, user);
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", post_moment=" + post_moment +
                ", status=" + status +
                ", animal=" + animal +
                ", user=" + user +
                '}';
    }
}
