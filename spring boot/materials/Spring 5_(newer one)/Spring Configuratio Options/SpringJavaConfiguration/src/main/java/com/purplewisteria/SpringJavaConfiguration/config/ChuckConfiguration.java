package com.purplewisteria.SpringJavaConfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

// JAVA BASED CONFIGURATION...

@Configuration
public class ChuckConfiguration {
	
	@Bean
	 public ChuckNorrisQuotes chuckNorrisQuotes() {
		  return new  ChuckNorrisQuotes();
	 }
	
	
	

}
