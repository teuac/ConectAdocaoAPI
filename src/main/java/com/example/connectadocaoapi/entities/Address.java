package com.example.connectadocaoapi.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

}
