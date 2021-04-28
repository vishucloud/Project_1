package com.purplewisteria.borrowingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loans {
	@Id
	private Long id;
	
	private String loanType;
	private double apr;
	private String term;
	private int port;
	
	public Loans() {
		
	}
	public Loans(Long id, String loanType, double apr, String term, int port) {
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
