package com.purplewisteria.bankingservicecaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.purplewisteria.bankingservicecaller")
@EnableDiscoveryClient
public class BankingServiceCallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingServiceCallerApplication.class, args);
	}

}
