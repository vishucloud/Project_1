package com.purplewisteria.bankingservice.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
import com.purplewisteria.bankingservice.bean.BankingContacts;
import com.purplewisteria.bankingservice.config.BankingServiceConfiguration;
import com.purplewisteria.bankingservice.model.CreditCard;
import com.purplewisteria.bankingservice.model.Savings;
import com.purplewisteria.bankingservice.repository.CreditCardRepository;
import com.purplewisteria.bankingservice.repository.SavingsRepository;


//Exposing a simple Banking web service, returning the 'Banking Service Configuration' 
//
@RestController
public class BankingServiceController {

// Pick the configuration from the application.properties	
	@Autowired
private BankingServiceConfiguration bankingServiceConfiguration;

	@Autowired
	private Environment environment;
	
	@Autowired
	private CreditCardRepository creditCardRepository;

	@Autowired
	private SavingsRepository savingsRepository;

	@GetMapping ("/banking")
	 public BankingContacts retrieveBankingInfoFromConfigurations() {
		
		return new BankingContacts(bankingServiceConfiguration.getContact(),
				bankingServiceConfiguration.getMail() );
	   }
	
	@GetMapping("/banking-Service-feign/cards")
	public List<CreditCard> retrieveCreditCards() {
		
			List<CreditCard> creditCards = (List<CreditCard>) creditCardRepository.findAll();
		
			 Iterator<CreditCard> cardsIterator = creditCards.iterator();
	         while(cardsIterator.hasNext()) {
	        	 CreditCard creditCard =	 cardsIterator.next();
	        	 
		// Setting up Dynamic Port in the the Response
		creditCard.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
	         }
		return creditCards;
	}
	
	@GetMapping("/savings/accounts")
	public List<Savings> retrieveAccounts() {
		
		List<Savings> savings = (List<Savings>) savingsRepository.findAll();
		
		Iterator<Savings> savingsIterator = savings.iterator();
        while( savingsIterator.hasNext()) {
       	Savings  savingsDetails=	  savingsIterator.next();
       	 
	// Setting up Dynamic Port in the the Response
       	savingsDetails.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
        }
	return savings;
	}
	
	@GetMapping("/credit-cards/card/{cardName}")
	public CreditCard retrieveCreditCardDetails(@PathVariable String cardName) {
		
		CreditCard creditCard = creditCardRepository.findBycardName(cardName);
		
		// Setting up Dynamic Port in the the Response
		creditCard.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
		return creditCard;
	}
	
	@GetMapping("/savings/account/{accountType}")
	public Savings retrieveSavingsDetails(@PathVariable String accountType) {
		
		Savings savings = savingsRepository.findByaccountType(accountType);
		
		// Setting up Dynamic Port in the the Response
		savings.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
		return savings;
	}
	
	


}
