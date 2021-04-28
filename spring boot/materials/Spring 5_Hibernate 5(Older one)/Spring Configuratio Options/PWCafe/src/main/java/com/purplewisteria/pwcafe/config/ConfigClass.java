package com.purplewisteria.pwcafe.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class ConfigClass {

	@Autowired
    private Environment env;

	public Environment getEnv() {
		return env;
	} 
	
	
}
