package com.purplewisteria.SpringJavaConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// '@ImportResource' informs spring to check the class path for the given file name.
@ImportResource("classpath:chuck-config.xml")
public class JokesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesappApplication.class, args);
	}

}

