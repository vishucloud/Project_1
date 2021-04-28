package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class TouringMountainBike extends Bike {

	public TouringMountainBike(String bikeType, String model, double price) {
		super(bikeType, model, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String showBikeDetails () {
		
		return "Touring Mountain Bike: " + "\n" + super.showBikeDetails();
		
	}
}
