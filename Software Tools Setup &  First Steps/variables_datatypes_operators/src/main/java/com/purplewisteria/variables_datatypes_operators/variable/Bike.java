package com.purplewisteria.variables_datatypes_operators.variable;

public class Bike {

    public static void main(String[] args) {
    	
    	// Variable Declaration...with String Type

    	 String bikeName ="TRIBAN RC 520 DISC ROAD BIKE, NAVY - 105";
    	 
        String rating = "4.4/5";
        int reviews =    39;

      float bikePrice = 729.99f;
      double bottleCagePrice = 3.99d;

        double totalBikePrice = bikePrice + bottleCagePrice;

        System.out.println("Total Bike Price: " + "$ " + totalBikePrice);
    }
}
