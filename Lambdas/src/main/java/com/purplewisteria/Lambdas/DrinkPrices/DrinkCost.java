package com.purplewisteria.Lambdas.DrinkPrices;

@FunctionalInterface
public interface DrinkCost {

	public double  costOfDrink( double ouncePrice, int noOfOunces );
	
	
}
