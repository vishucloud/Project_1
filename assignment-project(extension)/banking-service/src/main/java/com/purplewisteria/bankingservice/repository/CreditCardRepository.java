package com.purplewisteria.bankingservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.bankingservice.model.CreditCard;

public interface CreditCardRepository extends CrudRepository <CreditCard, Long>{
	
	// Query method.. User-Defined
	CreditCard findBycardName( String cardName);

}