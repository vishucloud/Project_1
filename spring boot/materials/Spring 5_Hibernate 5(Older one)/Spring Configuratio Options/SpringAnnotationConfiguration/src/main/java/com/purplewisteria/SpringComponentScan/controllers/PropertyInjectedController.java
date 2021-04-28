package com.purplewisteria.SpringComponentScan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.purplewisteria.services.GreetingService;

@Controller
public class PropertyInjectedController {

	// Spring do the dependency injection by matching the type..
	
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}