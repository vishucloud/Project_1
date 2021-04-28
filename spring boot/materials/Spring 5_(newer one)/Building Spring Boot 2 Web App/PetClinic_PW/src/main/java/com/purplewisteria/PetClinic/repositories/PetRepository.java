package com.purplewisteria.PetClinic.repositories;
import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.PetClinic.model.Pet;

//ADDING SPRING DATA JPA REPOSITORIES

public interface PetRepository extends CrudRepository<Pet, Long> {
	
}