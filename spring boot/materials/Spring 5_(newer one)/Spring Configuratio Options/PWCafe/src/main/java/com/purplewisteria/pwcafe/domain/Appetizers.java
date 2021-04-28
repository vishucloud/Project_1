package com.purplewisteria.pwcafe.domain;


public class Appetizers extends FoodItem {
	
	private String appetizerName;
	private double price;
	private int quanity;
	
	public  Appetizers( ) {
	
	}
	
	public  Appetizers(String appetizerName, double price ) {
		this.appetizerName = appetizerName;
		this.price = price;
	}
	
	public String getAppetizerName() {
		return appetizerName;
	}
	public void setAppetizerName(String appetizerName) {
		this.appetizerName = appetizerName;
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
