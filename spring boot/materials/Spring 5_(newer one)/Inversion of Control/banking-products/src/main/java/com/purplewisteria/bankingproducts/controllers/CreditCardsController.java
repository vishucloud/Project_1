package com.purplewisteria.bankingproducts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.bankingproducts.services.ProductService;

@Controller
public class CreditCardsController {
	
	 private ProductService productService;
	 
	 // SETTER INJECTION..
	// Spring do the dependency injection by type..
		
	   // @Qualifier("creditCards")
	 @Autowired  
	 @Qualifier("creditCards")
	    public void setProductService( 	     ProductService productService) {
	        this.productService = productService;
	    }
	 
	    @RequestMapping(value="/credit-cards")
	    public String service(Model model){
	        
	        model.addAttribute("creditCards", productService.product() );

	        return "creditCards";
	    }

	 
	

}
