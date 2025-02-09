package com.example.connectadocaoapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "phone_number")
public class PhoneNumber implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;


    public PhoneNumber() {

    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(id, that.id) && Objects.equals(number, that.number) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, user);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", user=" + user +
                '}';
    }
}
