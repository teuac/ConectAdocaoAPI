package com.example.connectadocaoapi.repositories;

import com.example.connectadocaoapi.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepostory extends JpaRepository<Address, Long> {
}
