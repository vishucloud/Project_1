package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex01;

public class ShowBikes {

	public static void main(String[] args) {
		
		   for(int i=1; i<12; i++) {
			   
	            Bike bike = BikeUtil.randomBike();
	            
	            System.out.println("Bike # " + i +
	                            " Bike Type: " + bike.getBikeType() + "\n" +
	                            " Bike Model: " + bike.getModel() + "\n" +
	                            " Bike Price: " + bike.getPrice() + "\n"        
	            		);
	        }
	}

}
