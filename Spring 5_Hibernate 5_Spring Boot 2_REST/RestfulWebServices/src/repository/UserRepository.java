package com.purplewisteria.RestfulWebServices.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.purplewisteria.RestfulWebServices.model.User;

@Repository
public interface UserRepository extends CrudRepository <User, Integer>{
	
	
	

}
