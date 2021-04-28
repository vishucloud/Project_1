package com.purplewisteria.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service ("cgs")

public class ConstructorGreetingService implements GreetingService {
	
    @Override
    public String sayGreeting() {
    	
        return "Hello - I was injected via the constructor!!!";
    }
    
    
    @PostConstruct
    // Spring calls methods annotated with @PostConstruct only once, just after the initialization of bean properties. 
    public void doSomeStartupStuff() {
    	System.out.println();
    	System.out.println(" *************** Spring PostConstruct and PreDestroy Annotations Demo ****************** ");
    	System.out.println("ConstructorGreetingService ->> Inside of doSomeStartupStuff() ");
    	System.out.println();
    }
   
    
    @PreDestroy
    //A method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context.
    public void doSomeCleanupStuff() {
    	System.out.println("ConstructorGreetingService ->> Inside of doSomeCleanupStuff() ");
    }
   
}