package com.purplewisteria.naming_conventions_packages.boxing;

public class AutoboxingInAction {

	public static void main(String[] args) {
		
	int[] values = { 3, 97, 55, 22, 12345 };

		
		// Array to store Integer objects
		Integer[] objs = new Integer[values.length];
		
		// Call method to cause boxing conversions
		
		 for(int i = 0 ; i < values.length; ++i) {

				objs[i] = boxInteger( values[i]  );
				//objs[i] = boxInteger( new Integer ( values[i] ) );

		}
		
		 // Use method to cause unboxing conversions
		
		 for(Integer intObject : objs) {
		
			 		int i = unboxInteger(intObject);
	    	
		  System.out.println(i);
		 }
		  }
		
	// Method to cause boxing conversion
		
	public static Integer boxInteger(Integer obj) {
			   return obj;
		}
	
	// Method to cause unboxing conversion
	
	public static int unboxInteger(int n) {
			
		return   n;

		}
}
