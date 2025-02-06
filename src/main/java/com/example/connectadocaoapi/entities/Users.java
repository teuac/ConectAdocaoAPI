package com.example.connectadocaoapi.entities;


import jakarta.persistence.*;



import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
    private Integer userType;
    private Date registeredIn;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PhoneNumber> phone_number = new ArrayList<>();

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private List<Address> address = new ArrayList<>();

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private List<Announcement> announcements = new ArrayList<>();


    public Users() {

    }

    public Users(String name, String email, String password, int userType, List<PhoneNumber> phone_number, List<Address> address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.phone_number = phone_number;
        this.registeredIn = new Date(Instant.now().toEpochMilli());
        this.address = address;
    }


    public String getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public List<PhoneNumber> getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(List<PhoneNumber> phone_number) {
        this.phone_number = phone_number;
    }

    public Date getRegisteredIn() {
        return registeredIn;
    }

    public void setRegisteredIn(Date registeredIn) {
        this.registeredIn = registeredIn;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }
}
