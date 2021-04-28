package com.purplewisteria.springboothibernatewebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.springboothibernatewebapp.modal.Instructor;

@Controller
public class HomeController {
	
	@RequestMapping({"", "/", "index", "index.html", "home"})
	public String index(Model model) {
		model.addAttribute("instructor", new Instructor());
		return "home";
	}

	
	
}
