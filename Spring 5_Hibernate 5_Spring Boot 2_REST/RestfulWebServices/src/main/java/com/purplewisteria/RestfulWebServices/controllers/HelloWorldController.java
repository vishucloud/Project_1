package com.purplewisteria.RestfulWebServices.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.RestfulWebServices.model.InfoBean;

// REST Service..
@RestController  // Handling REST requests...
public class HelloWorldController {
	
	@Autowired
private MessageSource messageSource; 
	
	// GET Method
	// URI - /infoBean
	// method - "info-bean"
	
	
/* RETURNING BEAN & CONVERTED INTO JSON & RETURNED BACK..TO THE REST CLIENT
	How does the InfoBean object get converted to JSON ?
	
*/			
	//@RequestMapping (method=RequestMethod.GET, path="/info-bean")
	@GetMapping(path="/info-bean")
	public InfoBean infoBean() {
		return new InfoBean("Creating RESTful Webservice in Spring Boot2");
	}
	
	
	// Creating a 'Service' with "Path" variable..
	@GetMapping(path="/info-bean/spring-version/{version}")
	public InfoBean springVersion(@PathVariable String version) {
		return new InfoBean( String.format("Spring Version,  %s", version));
	}
	
	@GetMapping(path="/welcome-internationalized")
	//Locale can be sent via header attribute
	// Based on 'Accept-Language' header, 'Locale' will be decided..
	public InfoBean welocomeInternationalized(@RequestHeader(name="Accept-Language", required=true) Locale locale) {
		return new InfoBean(messageSource.getMessage("good.morning.message", null, locale));
	}
	
}





