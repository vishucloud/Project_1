package com.purplewisteria.PetClinic.repositories;
import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.PetClinic.model.PetType;


//ADDING SPRING DATA JPA REPOSITORIES


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
	
	
}