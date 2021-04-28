package com.purplewisteria.bankingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCard {
	
	@Id
	private Long id;
	
	private String cardName;
	private double annualFee;
	private double foreignTransactionFee;
	private String welcomeOffer;
	private int port;
	
	public CreditCard() {
		
	}
	
	public CreditCard(Long id, String cardName, double annualFee, double foreignTransactionFee, String welcomeOffer) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.annualFee = annualFee;
		this.foreignTransactionFee = foreignTransactionFee;
		this.welcomeOffer = welcomeOffer;
	}
	
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Long getId() {
		return id;
	}
	public String getCardName() {
		return cardName;
	}
	public double getAnnualFee() {
		return annualFee;
	}
	public double getForeignTransactionFee() {
		return foreignTransactionFee;
	}
	public String getWelcomeOffer() {
		return welcomeOffer;
	}
	
	
	


}
