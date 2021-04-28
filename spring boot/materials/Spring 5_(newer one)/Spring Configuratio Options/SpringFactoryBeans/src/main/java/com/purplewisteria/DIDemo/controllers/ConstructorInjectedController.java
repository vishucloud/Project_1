package com.purplewisteria.DIDemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.purplewisteria.DIDemo.services.GreetingService;


@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

 // Spring do the dependency injection by type..
	
    //@Autowired  
    /*
     From Spring 4.2, automatic wiring of constructor based components
     */
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
