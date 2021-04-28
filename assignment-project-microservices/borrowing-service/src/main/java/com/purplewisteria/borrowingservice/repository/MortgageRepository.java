package com.purplewisteria.borrowingservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.borrowingservice.model.Mortgage;


public interface MortgageRepository extends CrudRepository <Mortgage, Long>{
	
	// Query method.. User-Defined
	Mortgage findByterm( String term);

}