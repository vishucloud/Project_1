package com.purplewisteria.bankingservicecaller.bean;

public class LoansDetails {
	private Long id;
	
	private String loanType;
	private double apr;
	private String term;
	private int port;
	
	public LoansDetails () {
		
	}
	public LoansDetails (Long id, String loanType, double apr, String term, int port) {
		super();
		this.id = id;
		this.loanType = loanType;
		this.apr = apr;
		this.term = term;
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public String getLoanType() {
		return loanType;
	}
	public double getApr() {
		return apr;
	}
	public String getTerm() {
		return term;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port=port;
	}
	

}
