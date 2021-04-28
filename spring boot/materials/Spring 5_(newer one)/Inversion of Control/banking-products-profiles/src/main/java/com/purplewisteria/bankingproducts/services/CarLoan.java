package com.purplewisteria.bankingproducts.services;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
//we are making a 'CarLoan' bean belong to a particular profile 'cr'.
//Check out 'application.properties' file

/* Setting 'default' profile, when there is no active profile. 
Note: default profile will be active, when there are no active profiles.
		 */
@Profile( {"cr", "default"} )
public class CarLoan  implements ProductService {

	@Override
	public String product() {
		
		return "Loan Against Car";
	}

}
