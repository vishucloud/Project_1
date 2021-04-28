package com.purplewisteria.DIDemo.services;


public interface GreetingService {

    String sayGreeting();
  
    
    default String sayMessage() {
    	return "";
    }
}