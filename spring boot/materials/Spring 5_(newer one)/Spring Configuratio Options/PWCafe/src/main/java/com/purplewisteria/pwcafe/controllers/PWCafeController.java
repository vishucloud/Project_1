package com.purplewisteria.pwcafe.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.purplewisteria.pwcafe.domain.Appetizers;
import com.purplewisteria.pwcafe.domain.Mains;
import com.purplewisteria.pwcafe.domain.Soups;
import com.purplewisteria.pwcafe.services.MenuService;


@Controller
public class PWCafeController {
 
	@Autowired
	@Qualifier("appetizersMenuService")
	private MenuService menuServiceAppetizer;	
	
	@Autowired
	@Qualifier("mainsMenuService") 
	private MenuService menuServiceMains;

	@Autowired
	 @Qualifier("soupsMenuService")
	private MenuService menuServiceSoups;
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	 @RequestMapping("/")
		public String showWelcomePage( Model model) {
		 
			model.addAttribute("message", welcomeMessage);
			return "home.html";
			 
		}

	@RequestMapping("/mains")
		public String showMains( Model model) {
		 
			Set <Mains> setOfMains =	menuServiceMains.setOfMains();
			 
			 model.addAttribute("setOfMains", setOfMains);
			 
			return "menu.html";
			 
		}

	 @RequestMapping("/appetizers")
		public String showaApetizers( Model model) {

     	Set <Appetizers> setOfAppetizers = menuServiceAppetizer.setOfAppetizers();   
     	
     	 		model.addAttribute("setOfAppetizers", setOfAppetizers);
			
			return "menu.html";
			 
		}
	 
	 @RequestMapping("/soups")
		public String showSoups( Model model) {

		 Set <Soups> setOfSoups =  menuServiceSoups.setOfSoups();
			model.addAttribute("setOfSoups", setOfSoups);
			
			return "menu.html";
			 
		}

}
