package com.purplewisteria.pwcafe.domain;

public class Soups  extends FoodItem {
	
	private String soupName;
	private double price;
	private int quanity;
	
	public  Soups( ) {
		
	}
	
	public  Soups(String soupName, double price ) {
		this.soupName = soupName;
		this.price = price;
	}
	
	public String getSoupName() {
		return soupName;
	}
	public void setSoupName(String soupName) {
		this.soupName = soupName;
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
