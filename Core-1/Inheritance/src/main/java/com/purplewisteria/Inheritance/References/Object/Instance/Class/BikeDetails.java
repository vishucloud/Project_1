package com.purplewisteria.Inheritance.References.Object.Instance.Class;

import com.purplewisteria.Inheritance.RoadBike;

public class BikeDetails {

	public static void main(String[] args) {
		
		// creating a new 'instance' or 'object' for the class type 'RoadBike'
		// And the object is assigned to the 'roadBike' variable...
		// In other words it is a reference to the object in memory...
			RoadBike sportRoadBike = new RoadBike("FLAT HANDLEBAR ROAD BIKES","TRIBAN 500 FB ROAD BIKE - BLACK/WHITE/ORANGE", 300.00d, "XS | S | M | L | XL", 
				11.4d, "straight, Hi-Ten steel fork", "Change speeds with SRAM 3.0 push-pull type shifters. SRAM 3.0 long-cage rear derailleur",
				"Shimano TZ21 7-speed 14 X 28 freewheel", "B'Twin Sport flat oversize handlebars S/M/L in 560 mm / XL in 600 mm", "B'TWIN Sport wheels, 32 spokes",
				"Hutchinson Equinox 23 C", "B'TWIN Sport aluminium seat post Dia: 29.8 mm"
				);
		
		// Creating another reference called 'flatHandlebarRoadBike' to the same object in memory..
		// Here we have two references such as 'sportRoadBike' & 'flatHandlebarRoadBike' pointing to the same object in memory.
		//Still there is one RoadBike but two references to that one object.
			RoadBike flatHandlebarRoadBike = sportRoadBike;

			// Both will print the same value as we have two references to the same object.
			String bikeDetails;
			 bikeDetails = sportRoadBike.showBikeDetails();
			System.out.println(bikeDetails);
			System.out.println("------------------------------------------------------------------");
			
			 bikeDetails = flatHandlebarRoadBike.showBikeDetails();
			System.out.println(bikeDetails);
			System.out.println("------------------------------------------------------------------");
		

			// calling setter methods to set the new / update values..
			//Now both 'sportRoadBike' & 'flatHandlebarRoadBike' have same values...
			//Remember we have two references that point to the same object in memory...
			// So, once we change the suspension & drive train of one, both objects will have the same value 
			   // as both references point to the same object...
			 
			sportRoadBike.setSuspension("The Suntour XCT 80mm front suspension");
			sportRoadBike.setDriveTrain("3 chainrings with 7 cogs, so 21 speeds");
			
			 bikeDetails = sportRoadBike.showBikeDetails();
				System.out.println(bikeDetails);
				System.out.println("------------------------------------------------------------------");
				
				 bikeDetails = flatHandlebarRoadBike.showBikeDetails();
					System.out.println(bikeDetails);
					System.out.println("------------------------------------------------------------------");
			
	}

}

  
  