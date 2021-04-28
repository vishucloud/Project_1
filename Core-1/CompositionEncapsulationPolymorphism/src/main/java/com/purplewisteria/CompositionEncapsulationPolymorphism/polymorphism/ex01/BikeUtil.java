package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class BikeUtil {
	
	public static Bike randomBike() {
		
		   int randomNumber = (int) (Math.random() * 5) +1;
		   
	        System.out.println("Random number was generated for a Bike: " + randomNumber);
	        switch (randomNumber) {
	            case 1:
	               return new TouringMountainBike("TOURING MOUNTAIN BIKE", "ROCKRIDER 340 26 MOUNTAIN BIKE - ORANGE", 300.00d);
	            	  
	            case 2:
	                return new CrossCountryMountainBike("CROSS COUNTRY MOUNTAIN BIKE", "ROCKRIDER 900 27.5\" MOUNTAIN BIKE - GREY/LIME", 450.00d);
	            case 3:
	                return new TownTrekkingBike("TOWN TREKKING BIKE", "HOPRIDER 300 CITY BIKE LF", 250.00d);
	            case 4:
	                return new ElectricBike("ELECTRIC BIKE", "ORIGINAL 900 36V ELECTRIC BIKE", 700.00d);
	            case 5:
	                return new FoldingBike("FOLDING/COMPACT BIKE", "TILT 100 FOLDING BIKE - GREY", 275.00d);
	        }

	        return null;
	    }
	}



