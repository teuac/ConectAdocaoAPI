package com.example.connectadocaoapi.dtos;

import com.example.connectadocaoapi.entities.PhoneNumber;

public class PhoneNumberDTO {
    private String number;

    public PhoneNumberDTO(PhoneNumber phoneNumber) {
        this.number = phoneNumber.getNumber();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}