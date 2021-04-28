package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class FoldingBike extends Bike {

	public FoldingBike(String bikeType, String model, double price) {
		super(bikeType, model, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String showBikeDetails () {
		
		return "Folding Bike: " + "\n" + super.showBikeDetails();
		
	}

}
