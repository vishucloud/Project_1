package com.purplewisteria.bankingproducts.services;

import org.springframework.stereotype.Service;

@Service
public class FixedDeposits implements ProductService {

	@Override
	public String product() {
		
		return "Tax Saver Deposit";
	}

}
