package com.purplewisteria.PetClinic.repositories;
import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.PetClinic.model.Vet;

//ADDING SPRING DATA JPA REPOSITORIES

public interface VetRepository extends CrudRepository<Vet, Long> {
	
	
}
