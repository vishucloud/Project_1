package com.purplewisteria.CompositionEncapsulationPolymorphism.encapsulation;

public class Bike {
	
	// Applying Encapsulation...
/*
 You can create 'private' fields & 'private' functions that we don't want to be exposed to any other class,
 we can change those names at any time in this code without affecting any other code..one of the huge benefits of 
 'Encapsulation'
 
 Protecting members of the class & some methods from unauthorized external access.
 We are stopping outsiders/outside code from accessing the inner workings of a class.
 So, you can hide the inner working of a class from an another class. 
 */
	private String bikeType;
	private String model;
	private double price=500.00d;
	private String size;
	private String frame;
	private String brakes;
	private double weight;
	
	public Bike(String bikeType, String model, double price, String size, String frame, String brakes, double weight) {
		super();
		this.bikeType = bikeType;
		this.model = model;
		
		this.size = size;
		this.frame = frame;
		this.brakes = brakes;
		this.weight = weight;
		
		 if(price >200 && price <= 500) {
			 this.price = price;
	        }
	 }
	
	 
	
	public String showBikeDetails () {
		return "Basic Technical Details: " + "\n"  + "Bike Type: " + bikeType + "\n" + "Model: " + model + "\n"  + "Price: " + price + "\n" + "Size: "+ size + "\n"  + "Frame: " + frame + "\n"  + "Brakes: " + brakes + "\n"  + "weight: " + weight;
	}
	
	public void bikeCategory( String category) {
		System.out.println(category);
	}
	
	public String getBikeType() {
		return bikeType;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	
	
	
}