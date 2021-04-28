package com.purplewisteria.SpringComponentScan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.purplewisteria.services.GreetingService;

@Controller
public class GetterInjectedController {
	
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

 // Spring do the dependency injection by type..
	
    @Autowired
    //@Qualifier("getterGreetingService")
    public void setGreetingService(@Qualifier("getterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}