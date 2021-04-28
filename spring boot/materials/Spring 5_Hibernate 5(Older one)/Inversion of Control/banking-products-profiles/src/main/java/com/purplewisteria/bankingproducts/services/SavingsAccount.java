package com.purplewisteria.bankingproducts.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("sb")
@Primary
// we are making a 'SavingsAccount' bean belong to a particular profile 'sb'.
//Check out 'application.properties' file

public class SavingsAccount implements ProductService {

	@Override
	public String product() {
		
		return "ASAP Instant Savings Account";
	}

}

