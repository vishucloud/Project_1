package com.purplewisteria.bankingproducts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.bankingproducts.services.ProductService;

@Controller
public class FixedDepositsController {

	// PROPERTY INJECTION...
	  @Autowired
	    
	private ProductService productService;
	  
	  
	  @RequestMapping("/fixed-deposits")
	    public String service(Model model){
	        
	        model.addAttribute("fixedDeposits", productService.product() );

	        return "fixedDeposits";
	    }

}
