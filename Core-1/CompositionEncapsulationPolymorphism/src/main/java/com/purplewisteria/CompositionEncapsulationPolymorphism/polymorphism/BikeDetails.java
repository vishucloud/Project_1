package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism;

public class BikeDetails {

	public static void main(String[] args) {
// Applying Polymorphism...	
		Bike bike;	
		String bikeDetails;
		
/* Polymorphism
 Allows actions to act differently based on the actual object that the action is being performed on	
*/	
		bike = new RoadBike("FLAT HANDLEBAR ROAD BIKES","TRIBAN 500 FB ROAD BIKE - BLACK/WHITE/ORANGE", 300.00d, "XS | S | M | L | XL", 
				11.4d, "straight, Hi-Ten steel fork", "Change speeds with SRAM 3.0 push-pull type shifters. SRAM 3.0 long-cage rear derailleur",
				"Shimano TZ21 7-speed 14 X 28 freewheel", "B'Twin Sport flat oversize handlebars S/M/L in 560 mm / XL in 600 mm", "B'TWIN Sport wheels, 32 spokes",
				"Hutchinson Equinox 23 C", "B'TWIN Sport aluminium seat post Dia: 29.8 mm"
				);
		  bikeDetails = bike.showBikeDetails();
		
		System.out.println(bikeDetails);
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		
		bike = new MountainBike("CROSS COUNTRY MOUNTAIN BIKE", "ROCKRIDER 920 SE MOUNTAIN BIKE-27.5", 600.00d, "M : 1M65-1M75 | L : 1M75-1M80", 11.80d, true, "Manitou Minute Comp fork with 120 mm travel",
				true, "Change speeds with SRAM 3.0 push-pull type shifters. SRAM 3.0 long-cage rear derailleur", "Rockrider 900 series oversize low rise 720 mm handlebar",
				"Hayes Prime Sport brakes", "Mavic Cross Ride FTS-X wheels | WTB Ranger 27.5 x 2.25. Weight: 820 g"
				);
		 bikeDetails = bike.showBikeDetails();
		
		System.out.println(bikeDetails);
		
		
		
	}

}

  
  
