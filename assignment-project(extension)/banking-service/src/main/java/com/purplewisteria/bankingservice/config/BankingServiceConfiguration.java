package com.purplewisteria.bankingservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties ("banking-service") // Want to read, anything starts with prefix "banking-service"

public class BankingServiceConfiguration {

	private String contact;
	private String mail;
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	


}
