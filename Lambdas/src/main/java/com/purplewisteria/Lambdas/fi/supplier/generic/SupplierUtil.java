package com.purplewisteria.Lambdas.fi.supplier.generic;

import java.util.function.Supplier;

public class SupplierUtil {
	
	  static void driveVehicle(Supplier<? extends Vehicle> supplier){
		  
	    Vehicle vehicle = supplier.get();
	    
	    vehicle.drive();   
    
	  }
	  
		static void display(Supplier<Integer> arg) {
			
	        System.out.println(arg.get());
	    }
		
	}