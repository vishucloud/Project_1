package com.purplewisteria.bankingservicecaller.bean;

public class CreditCardDetails {
	
	private Long id;
	
	private String cardName;
	private double annualFee;
	private double foreignTransactionFee;
	private String welcomeOffer;
	private int port;
	
	public CreditCardDetails() {
		
	}
	
	public CreditCardDetails(Long id, String cardName, double annualFee, double foreignTransactionFee, String welcomeOffer, int port) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.annualFee = annualFee;
		this.foreignTransactionFee = foreignTransactionFee;
		this.welcomeOffer = welcomeOffer;
		this.port = port;
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
