package com.purplewisteria.borrowingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mortgage {
	
	@Id
	private Long id;
	
	private String term;
	private double apr;
	private double rate;
	private int port;
	
	public Mortgage() {
		
	}
	public Mortgage(Long id, String term, double apr, double rate) {
		super();
		this.id = id;
		this.term = term;
		this.apr = apr;
		this.rate = rate;
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
