package com.purplewisteria.SpringRESTClient.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/* Building an application that uses Spring’s RestTemplate to consume a RESTful service.
 * A more useful way to consume a REST web service is programmatically..
 * Spring provides a convenient template class called RestTemplate
 * RestTemplate makes interacting with most RESTful services a one-line incantation a
    and it can even bind that data to custom domain types.
 */

/* Accessing a third-party REST service inside a Spring application revolves 
   around the use of the Spring RestTemplate class
 */

@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		
		return builder.build();
	}

}


// Reference: https://spring.io/guides/gs/consuming-rest/