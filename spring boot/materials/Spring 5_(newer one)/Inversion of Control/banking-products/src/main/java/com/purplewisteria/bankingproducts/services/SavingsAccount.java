package com.purplewisteria.bankingproducts.services;

import org.springframework.stereotype.Service;

@Service
public class SavingsAccount implements ProductService {

	@Override
	public String product() {
		
		return "ASAP Instant Savings Account";
	}

}
