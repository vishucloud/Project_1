package com.purplewisteria.bankingproducts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.bankingproducts.services.ProductService;

@Controller
public class SavingsAccountController {

	// CONSTRUCTOR INJECTION 
	
	 private ProductService productService;

	 // Spring do the dependency injection by type..
		
	@Autowired  
	    /*
	     From Spring 4.2, automatic wiring of constructor based components
	     */
	    public SavingsAccountController (@Qualifier("savingsAccount") ProductService productService) {
	        this.productService = productService;
	    }

	    @RequestMapping("/savings-account")
	    public String service(Model model){
	        
	        model.addAttribute("savingsAccount", productService.product() );

	        return "savingsAccounT";
	    }
	    
}
