package com.example.connectadocaoapi.controllers;

import com.example.connectadocaoapi.dtos.UsersDTO;
import com.example.connectadocaoapi.entities.Address;
import com.example.connectadocaoapi.entities.PhoneNumber;
import com.example.connectadocaoapi.entities.Users;
import com.example.connectadocaoapi.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public ResponseEntity<UsersDTO> createUser(@RequestBody Users user) {
        UsersDTO savedUser = usersService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UsersDTO>> listAllUsers() {
        List<UsersDTO> users = usersService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    
}
