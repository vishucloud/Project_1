package com.purplewisteria.pwcafe.domain;

public class Mains  extends FoodItem {
	
	private String mainsName;
	private double price;
	private int quanity;

	public Mains( ) {
	
	}
	
	public Mains(String mainsName, double price ) {
		this.mainsName = mainsName;
		this.price = price;
	}
	
	public String getMainsName() {
		return mainsName;
	}
	public void setMainsName(String mainsName) {
		this.mainsName = mainsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuanity() {
		return quanity;
	}


	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	@Override
	public double calculateItemPrice(double price, int quantity) {
		double totalPrice = (double) price * quantity;
		return totalPrice;
	}
	
}

