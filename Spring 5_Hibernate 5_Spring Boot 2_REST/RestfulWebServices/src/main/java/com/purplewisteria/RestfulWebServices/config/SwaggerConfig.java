package com.purplewisteria.RestfulWebServices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Configuring Auto Generation of Swagger Documentation
//Enable Swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2);
	} 

}



/* Documentation: 
   1.) http://localhost:8080/v2/api-docs
          OR
  2.) http://localhost:8080/swagger-ui.html
 
 Note:
  springfox.documentation.spring.web.plugins.Docket
 A builder which is intended to be the primary interface into the swagger-springmvc framework.
  Provides sensible defaults and convenience methods for configuration.
 */
