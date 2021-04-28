package com.purplewisteria.Lambdas.fi.supplier.generic;

import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		
		  //Using Lambda expression
		//SupplierUtil .driveVehicle(()-> new Vehicle());
		
		Supplier<? extends Vehicle> supplier  =   ()-> { return new Ferrari (); };
		
		SupplierUtil .driveVehicle( supplier );
		   
		  //Using method expression.
		
	SupplierUtil .driveVehicle(  ()-> { return new Ferrari (); });
	
		SupplierUtil .driveVehicle( Ferrari::new);
		  
		int n = 3;
	
		
		SupplierUtil.display(() -> n + 10);
		
		SupplierUtil. display(() -> n + 100);
        
		}
	
	
}
