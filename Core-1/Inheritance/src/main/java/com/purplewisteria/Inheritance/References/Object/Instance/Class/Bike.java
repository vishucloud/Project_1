package com.purplewisteria.Inheritance.References.Object.Instance.Class;

// 'Bike' Class Type Declaration...(blue print)
public class Bike {
	
	//Fields (instance variables)....
	private String bikeType;
	private String model;
	private double price;
	private String size;
	private String frame;
	private String brakes;
	private double weight;
	
	public Bike(String bikeType, String model, double price, String size, String frame, String brakes, double weight) {
		super();
		this.bikeType = bikeType;
		this.model = model;
		this.price = price;
		this.size = size;
		this.frame = frame;
		this.brakes = brakes;
		this.weight = weight;
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