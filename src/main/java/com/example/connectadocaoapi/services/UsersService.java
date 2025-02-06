package com.example.connectadocaoapi.services;

import com.example.connectadocaoapi.dtos.UsersDTO;
import com.example.connectadocaoapi.entities.Address;
import com.example.connectadocaoapi.entities.PhoneNumber;
import com.example.connectadocaoapi.entities.Users;
import com.example.connectadocaoapi.exceptions.ResourceNotFoundException;
import com.example.connectadocaoapi.repositories.AddressRepostory;
import com.example.connectadocaoapi.repositories.PhoneNumberRepository;
import com.example.connectadocaoapi.repositories.UsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Autowired
    private AddressRepostory addressRepostory;

    @Transactional
    public UsersDTO saveUser(Users user) {
        if (user.getRegisteredIn() == null) {
            user.setRegisteredIn(new Date(System.currentTimeMillis()));
        }
        if (user.getPhone_number() != null) {
            for (PhoneNumber phoneNumber : user.getPhone_number()) {
                phoneNumber.setUser(user);
            }
        }

        if (user.getAddress() != null) {
            for (Address address : user.getAddress()) {
                address.setUser(user);
            }
        }

        Users savedUser = usersRepository.save(user);
        return new UsersDTO(savedUser);  // Retorna o DTO após salvar
    }

    public List<UsersDTO> getAllUsers() {
        List<Users> users = usersRepository.findAll();
        return users.stream()
                .map(UsersDTO::new)  // Converte cada entidade Users em UsersDTO
                .collect(Collectors.toList());
    }

}
