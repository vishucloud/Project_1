package com.purplewisteria.bankingproducts.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("fd")
@Primary
//we are making a 'FixedDeposits' bean belong to a particular profile 'fd'.
//Check out 'application.properties' file

public class FixedDeposits implements ProductService {

	@Override
	public String product() {
		
		return "Tax Saver Deposit";
	}

}
