package com.purplewisteria.bankingproducts.services;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CarLoan  implements ProductService {

	@Override
	public String product() {
		
		return "Loan Against Car";
	}

}
