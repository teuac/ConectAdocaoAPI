package com.example.connectadocaoapi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phone_number")
@Data
public class PhoneNumber {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
