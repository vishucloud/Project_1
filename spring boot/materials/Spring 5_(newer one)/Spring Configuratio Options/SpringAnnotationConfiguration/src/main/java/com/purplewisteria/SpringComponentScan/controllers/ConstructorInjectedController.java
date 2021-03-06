package com.purplewisteria.SpringComponentScan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.purplewisteria.services.GreetingService;


@Controller
@Scope ("prototype")
public class ConstructorInjectedController {

    private GreetingService greetingService;

 // Spring do the dependency injection by type..
	
   // @Autowired  
    /*
     From Spring 4.2, automatic wiring of constructor based components
     */
    public ConstructorInjectedController(@Qualifier("cgs") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
