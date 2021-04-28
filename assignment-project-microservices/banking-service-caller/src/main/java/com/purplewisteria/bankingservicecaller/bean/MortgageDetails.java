package com.purplewisteria.bankingservicecaller.bean;

public class MortgageDetails {

	private Long id;
	
	private String term;
	private double apr;
	private double rate;
	private int port;
	
	public MortgageDetails() {
		
	}
	public MortgageDetails(Long id, String term, double apr, double rate, int port) {
		super();
		this.id = id;
		this.term = term;
		this.apr = apr;
		this.rate = rate;
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
	public String getTerm() {
		return term;
	}
	public double getApr() {
		return apr;
	}
	public double getRate() {
		return rate;
	}
	

}
