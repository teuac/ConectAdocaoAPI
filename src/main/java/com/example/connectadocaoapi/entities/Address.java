package com.example.connectadocaoapi.entities;


import jakarta.persistence.*;
import org.apache.catalina.User;

import java.io.Serializable;

@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String state;
    private String city;
    private String street;
    @Column(length = 20)
    private String postal_code;
    @Column(length = 20)
    private String number;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;


    public Address() {

    }


    public Address( String state, String city, String street, String postal_code, String number){
        this.state = state;
        this.city = city;
        this.street = street;
        this.postal_code = postal_code;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }




}
