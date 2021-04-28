package com.purplewisteria.bankingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Savings {
	
	@Id
	private Long id;
	private String accountType;
	private double maintenanceFee;
	private double openingDeposit;
	private double apy;
	private int port;
	
	public Savings() {
		
	}
	
	public Savings(Long id, String accountType, double maintenanceFee, double openingDeposit, double apy) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.maintenanceFee = maintenanceFee;
		this.openingDeposit = openingDeposit;
		this.apy = apy;
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
