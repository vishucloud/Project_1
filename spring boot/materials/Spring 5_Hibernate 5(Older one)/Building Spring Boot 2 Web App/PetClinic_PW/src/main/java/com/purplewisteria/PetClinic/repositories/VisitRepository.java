package com.purplewisteria.PetClinic.repositories;
import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.PetClinic.model.Visit;

//ADDING SPRING DATA JPA REPOSITORIES

public interface VisitRepository extends CrudRepository<Visit, Long> {
	
	
}