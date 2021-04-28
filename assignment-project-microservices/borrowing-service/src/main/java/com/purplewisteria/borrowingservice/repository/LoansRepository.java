package com.purplewisteria.borrowingservice.repository;


import org.springframework.data.repository.CrudRepository;
import com.purplewisteria.borrowingservice.model.Loans;

public interface LoansRepository extends CrudRepository <Loans, Long>{
	
	// Query method.. User-Defined
	Loans findByloanType( String loanType);

}