package com.purplewisteria.bankingservice.repository;
import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.bankingservice.model.Savings;

public interface SavingsRepository  extends CrudRepository <Savings, Long>{
	
	// Query method.. User-Defined
	Savings findByaccountType( String accountType);

}