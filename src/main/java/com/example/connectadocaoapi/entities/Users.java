package com.example.connectadocaoapi.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @UniqueElements
    private String email;
    private String password;
    private Integer userType;
    private Instant registeredIn;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PhoneNumber> phone_number = new ArrayList<>();

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private List<Address> address = new ArrayList<>();



}
