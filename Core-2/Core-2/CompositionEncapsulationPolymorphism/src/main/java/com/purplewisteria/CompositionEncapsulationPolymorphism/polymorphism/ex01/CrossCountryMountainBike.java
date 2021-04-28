package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class CrossCountryMountainBike extends Bike {
	
	public CrossCountryMountainBike(String bikeType, String model, double price) {
		super(bikeType, model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showBikeDetails () {
		
		return "Cross Country Mountain Bike: " + "\n" + super.showBikeDetails();
		
	}
}
