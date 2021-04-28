package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class Bike {
	
	private String bikeType;
	private String model;
	private double price;
	
	public Bike(String bikeType, String model, double price) {
		//super();
		this.bikeType = bikeType;
		this.model = model;
		this.price = price;
	}

	public String showBikeDetails () {
		return "Bike Details: " + "\n"  + "Bike Type: " + this.bikeType + "\n" + "Model: " + this.model + "\n"  + "Price: " + price;
	}
	
	public String getBikeType() {
		return this.bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
