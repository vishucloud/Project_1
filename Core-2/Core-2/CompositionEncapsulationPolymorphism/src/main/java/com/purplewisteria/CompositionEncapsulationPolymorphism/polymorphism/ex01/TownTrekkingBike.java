package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class TownTrekkingBike extends Bike {

	public TownTrekkingBike(String bikeType, String model, double price) {
		super(bikeType, model, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String showBikeDetails () {
		
		return "Town Trekking Bike: " + "\n" + super.showBikeDetails();
		
	}

}
