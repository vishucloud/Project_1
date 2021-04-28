package com.purplewisteria.PetClinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.PetClinic.model.Owner;


// ADDING SPRING DATA JPA REPOSITORIES

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
    
  //  List<Owner> findAllByAddress(String address);
    
    //Owner findByAddress(String address);
    
}

