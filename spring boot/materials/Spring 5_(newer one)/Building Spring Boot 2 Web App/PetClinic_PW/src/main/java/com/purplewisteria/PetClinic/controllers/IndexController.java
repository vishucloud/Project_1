package com.purplewisteria.PetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"", "/", "index", "index.html", "home"})
	public String index() {
		
		return "index";
	}

}
