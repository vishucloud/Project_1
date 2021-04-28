package com.purplewisteria.borrowingservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties ("borrowing-service") // Want to read, anything starts with prefix "borrowing-service"
public class BorrowingServiceConfiguration {
	
	
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
