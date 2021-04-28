package com.purplewisteria.bankingservicecaller.controller;

	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.bankingservicecaller.bean.LoansDetails;
import com.purplewisteria.bankingservicecaller.bean.MortgageDetails;

	//Creating a service for Banking Service
	@RestController
	public class BorrowingServiceCallerController {		
		@Autowired
		private BorrowingServiceProxy borrowingServiceProxy;
		 
		
	/* Using Feign REST Service Client for service invocation
	 * Create Feign proxy to talk to external microservices...
	 * Feign (Spring Cloud Component) - Spring inherits from 'Netflix'
	 * 
	 * Feign makes easy to invoke other microservices, and also it provides integration with 'Ribbon' which is used for
	 * client side load balancing
	 */
	@GetMapping("/borrowing-service-feign/mortgageTerm/{mortgageTerm}")
		public MortgageDetails mortgageDetailsFeign(@PathVariable String mortgageTerm) {
		
		// Getting the actual response object...
			MortgageDetails mortgageDetails   = borrowingServiceProxy.retrieveMortgageDetails(mortgageTerm);
		
			return new  MortgageDetails(mortgageDetails.getId(), mortgageDetails.getTerm(),
					mortgageDetails.getApr(), mortgageDetails.getRate(),
					mortgageDetails.getPort());
			
		}
	
	@GetMapping("/borrowing-service-feign/loanType/{loanType}")
	public LoansDetails loansDetailsFeign(@PathVariable String loanType) {
	
	// Getting the actual response object...
		LoansDetails loansDetails  = borrowingServiceProxy.retrieveLoanDetails(loanType);
	
		return new  LoansDetails(loansDetails.getId(), loansDetails.getLoanType(),
				loansDetails.getApr(), loansDetails.getTerm(),
				loansDetails.getPort());
	 }
	
	}


