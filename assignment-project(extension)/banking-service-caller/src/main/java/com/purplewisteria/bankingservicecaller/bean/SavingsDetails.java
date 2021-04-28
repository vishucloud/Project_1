package com.purplewisteria.bankingservicecaller.bean;


public class SavingsDetails {
	
	private Long id;
	private String accountType;
	private double maintenanceFee;
	private double openingDeposit;
	private double apy;
	private int port;
	
	public SavingsDetails() {
		
	}
	
	public SavingsDetails(Long id, String accountType, double maintenanceFee, double openingDeposit, double apy, int port) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.maintenanceFee = maintenanceFee;
		this.openingDeposit = openingDeposit;
		this.apy = apy;
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

	public String getAccountType() {
		return accountType;
	}

	public double getMaintenanceFee() {
		return maintenanceFee;
	}

	public double getOpeningDeposit() {
		return openingDeposit;
	}

	public double getApy() {
		return apy;
	}
	
	
	
	
	
	

}