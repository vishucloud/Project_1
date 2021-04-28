package com.purplewisteria.bankingservicecaller.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import com.purplewisteria.bankingservicecaller.bean.CreditCardDetails;
import com.purplewisteria.bankingservicecaller.bean.MortgageDetails;
import com.purplewisteria.bankingservicecaller.bean.SavingsDetails;

//Creating a service for Banking Service
@Controller
public class BankingServiceCallerController {
	
	@Autowired
	private BankingServiceProxy bankingServiceProxy; 
	
/* Using Feign REST Service Client for service invocation
 * Create Feign proxy to talk to external microservices...
 * Feign (Spring Cloud Component) - Spring inherits from 'Netflix'
 * 
 * Feign makes easy to invoke other microservices, and also it provides integration with 'Ribbon' which is used for
 * client side load balancing
 */
	@RequestMapping({"", "/", "index", "index.html", "home"})
	public String index() {
		
		return "index";
	}
	

	@GetMapping("/banking-Service-feign/cards")
	public String creditCardsFeign(Model model) {
	
	// Getting the actual response object...
		 List<CreditCardDetails> creditCards   = bankingServiceProxy.retrieveCreditCards();
	
		 Iterator<CreditCardDetails> cardsIterator = creditCards.iterator();
		         while(cardsIterator.hasNext()) {
		        	 CreditCardDetails creditCardDetails =	 cardsIterator.next();
		        	 
		        	 new  CreditCardDetails(creditCardDetails.getId(), creditCardDetails.getCardName(),
		     				creditCardDetails.getAnnualFee(), creditCardDetails.getForeignTransactionFee(),
		     				creditCardDetails.getWelcomeOffer(),
		                                            creditCardDetails.getPort());
		     		
		         }
		         model.addAttribute("cardsList", creditCards );
		 		
		 		return "credit_cards/cards-list";
		}
	

	@GetMapping("/banking-service-feign/accounts")
	public String savingsFeign(Model model) {
	
	// Getting the actual response object...
		 List<SavingsDetails> savings   = bankingServiceProxy.retrieveAccounts();
	
		 Iterator<SavingsDetails> savingsIterator = savings.iterator();
		         while(savingsIterator.hasNext()) {
		        	 SavingsDetails savingsDetails =	 savingsIterator.next();
		        	 
		        	 new  SavingsDetails(savingsDetails.getId(), savingsDetails.getAccountType(),
		        			 savingsDetails.getMaintenanceFee(), savingsDetails.getOpeningDeposit(),
		        			 savingsDetails.getApy(),
		        			 savingsDetails.getPort());
		     		
		         }
		         model.addAttribute("savingsAccountsList", savings );
		 		
		 		return "accounts/accounts-list";
		}
	
	
	
	
	@GetMapping("/banking-Service-feign/card/{cardName}")
	public String creditCardDetailsFeign(@PathVariable String cardName, Model model) {
	
	// Getting the actual response object...
		 CreditCardDetails creditCardDetails   = bankingServiceProxy.retrieveCreditCardDetails(cardName);
	
		 creditCardDetails  = new  CreditCardDetails(creditCardDetails.getId(), creditCardDetails.getCardName(),
				creditCardDetails.getAnnualFee(), creditCardDetails.getForeignTransactionFee(),
				creditCardDetails.getWelcomeOffer(),
                                       creditCardDetails.getPort());
		
		   model.addAttribute("cardsList", creditCardDetails  );
		return "credit_cards/cards-list";
		
	}
	
	
	@GetMapping("/banking-service-feign/account/{accountType}")
	public String savingsDetailsFeign(@PathVariable String accountType, Model model) {
	
	// Getting the actual response object...
		 SavingsDetails savingsDetails   = bankingServiceProxy.retrieveSavingsDetails(accountType);
	
		 savingsDetails = new  SavingsDetails(savingsDetails.getId(), savingsDetails.getAccountType(),
				savingsDetails.getMaintenanceFee(), savingsDetails.getOpeningDeposit(),
				savingsDetails.getApy(), savingsDetails.getPort());
		 
		 model.addAttribute("savingsAccountsList", savingsDetails );
		 
		 return "accounts/accounts-list";
		
	}
	
	
}

