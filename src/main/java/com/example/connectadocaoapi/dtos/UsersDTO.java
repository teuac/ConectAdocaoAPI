package com.example.connectadocaoapi.dtos;

import com.example.connectadocaoapi.entities.Users;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UsersDTO {


        private String id;
        private String name;
        private String email;
        private Integer userType;
        private Date registeredIn;
        private List<PhoneNumberDTO> phoneNumbers;
        private List<AddressDTO> addresses;

        public UsersDTO(Users user) {
            this.id = user.getId();
            this.name = user.getName();
            this.email = user.getEmail();
            this.userType = user.getUserType();
            this.registeredIn = user.getRegisteredIn();
            this.phoneNumbers = user.getPhone_number().stream()
                    .map(PhoneNumberDTO::new)
                    .collect(Collectors.toList());
            this.addresses = user.getAddress().stream()
                    .map(AddressDTO::new)
                    .collect(Collectors.toList());
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public List<PhoneNumberDTO> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Date getRegisteredIn() {
        return registeredIn;
    }

    public void setRegisteredIn(Date registeredIn) {
        this.registeredIn = registeredIn;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }
}

