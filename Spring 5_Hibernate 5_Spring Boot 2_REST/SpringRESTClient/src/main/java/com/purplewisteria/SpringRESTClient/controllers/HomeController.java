package com.purplewisteria.SpringRESTClient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	@RequestMapping({"", "/", "home", "home.html", "home"})
	public String index(Model model) {
	
		return "home";
	}

	
	
}
