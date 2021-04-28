package com.purplewisteria.bankingservicecaller.controller;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.purplewisteria.bankingservicecaller.bean.CreditCardDetails;
import com.purplewisteria.bankingservicecaller.bean.MortgageDetails;
import com.purplewisteria.bankingservicecaller.bean.SavingsDetails;


// To talk to an external microservices..
	// Creating a proxy which uses 'Feign' to enable us to call the banking-service service 
//@FeignClient(name="banking-service", url="localhost:8001")
//@FeignClient(name="banking-service")
@FeignClient(name="netflix-zuul-api-gateway-server")

/* Ribbon makes the use of 'Feign' configuration and help us to distribute the calls between the
  difference instances of the 'banking-service
 */
//What URL's the load for this service has to be distributed between 

@RibbonClient(name="banking-service")

public interface BankingServiceProxy {
		
	@GetMapping("/credit-cards/card/{cardName}")
	public CreditCardDetails retrieveCreditCardDetails(@PathVariable String cardName );
		
	@GetMapping("/savings/account/{accountType}")
	public SavingsDetails retrieveSavingsDetails(@PathVariable String accountType );
	
	//@GetMapping("banking-Service-feign/cards")
	//public List<CreditCardDetails> retrieveCreditCards();
	
	@GetMapping("/banking-service/banking-Service-feign/cards")
	public List<CreditCardDetails> retrieveCreditCards();
	
	@GetMapping("/savings/accounts")
	public List<SavingsDetails> retrieveAccounts();

}
