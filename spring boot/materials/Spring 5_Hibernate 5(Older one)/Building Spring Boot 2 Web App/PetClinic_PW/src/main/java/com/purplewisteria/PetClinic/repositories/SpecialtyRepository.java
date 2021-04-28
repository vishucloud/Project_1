package com.purplewisteria.PetClinic.repositories;
import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.PetClinic.model.Speciality;

//ADDING SPRING DATA JPA REPOSITORIES

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {


}
