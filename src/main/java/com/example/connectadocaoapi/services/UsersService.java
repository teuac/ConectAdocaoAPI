package com.example.connectadocaoapi.services;

import com.example.connectadocaoapi.entities.Address;
import com.example.connectadocaoapi.entities.PhoneNumber;
import com.example.connectadocaoapi.entities.Users;
import com.example.connectadocaoapi.repositories.AddressRepostory;
import com.example.connectadocaoapi.repositories.PhoneNumberRepository;
import com.example.connectadocaoapi.repositories.UsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Autowired
    private AddressRepostory addressRepostory;



    @Transactional
    public Users saveUser(Users user){

        if(user.getAddress() != null){
            for(Address address : user.getAddress()){
                address.setUser(user);
            }
        }

        if(user.getPhone_number() != null){
            for(PhoneNumber phoneNumber : user.getPhone_number()){
                phoneNumber.setUser(user);
            }
        }

        return usersRepository.save(user);
    }

}
