package com.purplewisteria.RestfulWebServices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
		
	}

	 @Bean
	public  LocaleResolver localResolver() {
		 
		 SessionLocaleResolver localeResolver  = new SessionLocaleResolver();
		 
		  localeResolver.setDefaultLocale(Locale.US);
		  return localeResolver;
	 }
	 // Configuring message source..
	 @Bean
		public  ReloadableResourceBundleMessageSource messageSource()  {
		 
		 //ResourceBundleMessageSource  messageSource = new  ResourceBundleMessageSource();
		 ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		 messageSource.setBasename("messages");
		 return messageSource;
		 
	 }
}
