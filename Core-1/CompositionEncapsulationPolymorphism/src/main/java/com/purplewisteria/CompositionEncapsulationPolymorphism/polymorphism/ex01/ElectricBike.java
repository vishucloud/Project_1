package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class ElectricBike extends Bike  {

	public ElectricBike(String bikeType, String model, double price) {
		super(bikeType, model, price);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String showBikeDetails () {
		
		return "Electric Bike: " + "\n" + super.showBikeDetails();
		
	}
}
