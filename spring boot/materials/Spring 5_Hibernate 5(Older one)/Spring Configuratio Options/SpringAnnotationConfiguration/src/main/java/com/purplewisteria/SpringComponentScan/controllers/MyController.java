package com.purplewisteria.SpringComponentScan.controllers;

import org.springframework.stereotype.Controller;

import com.purplewisteria.services.GreetingService;
/*
 Spring will create a bean for our 'MyController' & put it insode application context.
 */
@Controller
public class MyController {
	
	/* PrimaryGreetingServivce will be picked & wired up...as a only one primary bean, 
	if you didn't specify the qualified bean using @Qualifier
	*/
	// And, @Qualifier is used for wiring a specific bean by type.

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}