package com.purplewisteria.DIDemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.purplewisteria.DIDemo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	// Spring do the dependency injection by matching the type..
	
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}