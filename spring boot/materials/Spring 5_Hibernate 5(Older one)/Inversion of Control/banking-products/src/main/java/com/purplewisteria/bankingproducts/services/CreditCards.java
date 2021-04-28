package com.purplewisteria.bankingproducts.services;

import org.springframework.stereotype.Service;

@Service
public class CreditCards implements ProductService {

	@Override
	public String product() {
		
		return "Buzz Zone Credit Card";
	}

}
