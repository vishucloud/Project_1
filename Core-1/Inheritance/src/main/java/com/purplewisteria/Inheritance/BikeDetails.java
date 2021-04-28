package com.purplewisteria.Inheritance;

public class BikeDetails {

	public static void main(String[] args) {
		
		String bikeDetails;
		
		RoadBike roadBike = new RoadBike("FLAT HANDLEBAR ROAD BIKES","TRIBAN 500 FB ROAD BIKE - BLACK/WHITE/ORANGE", 300.00d, "XS | S | M | L | XL", 
				11.4d, "straight, Hi-Ten steel fork", "Change speeds with SRAM 3.0 push-pull type shifters. SRAM 3.0 long-cage rear derailleur",
				"Shimano TZ21 7-speed 14 X 28 freewheel", "B'Twin Sport flat oversize handlebars S/M/L in 560 mm / XL in 600 mm", "B'TWIN Sport wheels, 32 spokes",
				"Hutchinson Equinox 23 C", "B'TWIN Sport aluminium seat post Dia: 29.8 mm"
				);
	  bikeDetails = roadBike.showBikeDetails();
		
		System.out.println(bikeDetails);
		
		System.out.println("-------------------------------------------------");
		
		roadBike.bikeSpeed();
		
		RoadBike roadBike01 = new RoadBike("FLAT HANDLEBAR ROAD BIKES","TRIBAN 500 FB ROAD BIKE - BLACK/WHITE/ORANGE", 300.00d, "XS | S | M | L | XL", 
				11.4d, "straight, Hi-Ten steel fork", "Change speeds with SRAM 3.0 push-pull type shifters. SRAM 3.0 long-cage rear derailleur",
				"Shimano TZ21 7-speed 14 X 28 freewheel", "B'Twin Sport flat oversize handlebars S/M/L in 560 mm / XL in 600 mm", "B'TWIN Sport wheels, 32 spokes",
				"Hutchin"
				+ ""
				+ "son Equinox 23 C", "B'TWIN Sport aluminium seat post Dia: 29.8 mm"
				);
		
		bikeDetails =  roadBike01.showBikeDetails();
		
		System.out.println(bikeDetails);
	}
	
	
	

}

  
  
