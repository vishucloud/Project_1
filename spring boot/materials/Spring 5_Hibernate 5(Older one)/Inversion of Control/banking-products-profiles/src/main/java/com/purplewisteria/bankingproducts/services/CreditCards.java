package com.purplewisteria.bankingproducts.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cd")

@Primary
//we are making a 'CreditCards' bean belong to a particular profile 'cd'.
//Check out 'application.properties' file

public class CreditCards implements ProductService {

	@Override
	public String product() {
		
		return "Buzz Zone Credit Card";
	}

}
