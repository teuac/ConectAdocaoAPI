package com.example.connectadocaoapi.Users;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PhoneNumberEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter @Setter
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

}
