package com.example.connectadocaoapi.dtos;

import com.example.connectadocaoapi.entities.Address;

public class AddressDTO {
    private String state;
    private String city;
    private String street;
    private String postalCode;
    private String number;

    public AddressDTO(Address address) {
        this.state = address.getState();
        this.city = address.getCity();
        this.street = address.getStreet();
        this.postalCode = address.getPostal_code();
        this.number = address.getNumber();
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
