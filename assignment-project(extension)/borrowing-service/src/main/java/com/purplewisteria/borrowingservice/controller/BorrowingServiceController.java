package com.purplewisteria.borrowingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.borrowingservice.bean.BorrowingServiceContacts;
import com.purplewisteria.borrowingservice.config.BorrowingServiceConfiguration;
import com.purplewisteria.borrowingservice.model.Loans;
import com.purplewisteria.borrowingservice.model.Mortgage;
import com.purplewisteria.borrowingservice.repository.LoansRepository;
import com.purplewisteria.borrowingservice.repository.MortgageRepository;

@RestController
public class BorrowingServiceController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private MortgageRepository mortgageRepository;
	@Autowired
	private LoansRepository loansRepository;

// Pick the configuration from the application.properties	
	@Autowired
private BorrowingServiceConfiguration borrowingServiceConfiguration;


	@GetMapping ("/borrowing")
	 public BorrowingServiceContacts retrieveLimitsFromConfigurations() {
		
		return new BorrowingServiceContacts(borrowingServiceConfiguration.getContact(),
				borrowingServiceConfiguration.getMail()
				);
	 }
	
	@GetMapping("/mortgage/{mortgageTerm}")
	public Mortgage retrieveMortgageDetails(@PathVariable String mortgageTerm) {
		
		Mortgage mortgage  = mortgageRepository.findByterm(mortgageTerm);
		
		// Setting up Dynamic Port in the the Response
		mortgage.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
		return mortgage;
	}
	
	@GetMapping("/loans/{loanType}")
	public Loans retrieveLoanDetails(@PathVariable String loanType) {
		
		Loans loans  = loansRepository.findByloanType(loanType);
		
		// Setting up Dynamic Port in the the Response
		loans.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
		return loans;
	}
	
}