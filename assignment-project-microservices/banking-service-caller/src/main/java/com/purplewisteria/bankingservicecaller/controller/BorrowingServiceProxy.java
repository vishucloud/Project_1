package com.purplewisteria.bankingservicecaller.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.purplewisteria.bankingservicecaller.bean.LoansDetails;
import com.purplewisteria.bankingservicecaller.bean.MortgageDetails;

// To talk to an external microservices..
	// Creating a proxy which uses 'Feign' to enable us to call the banking-service service 
//@FeignClient(name="borrowing-service", url="localhost:9001")
@FeignClient(name="borrowing-service")

/* Ribbon makes the use of 'Feign' configuration and help us to distribute the calls between the
  difference instances of the 'currency exchange service
 */
//What URL's the load for this service has to be distributed between 

@RibbonClient(name="borrowing-service")

public interface BorrowingServiceProxy {
		
    @GetMapping("/mortgage/{mortgageTerm}")
	public MortgageDetails retrieveMortgageDetails(@PathVariable String mortgageTerm);
	
    @GetMapping("/loans/{loanType}")
	public LoansDetails retrieveLoanDetails(@PathVariable String loanType);
	
		
		

}