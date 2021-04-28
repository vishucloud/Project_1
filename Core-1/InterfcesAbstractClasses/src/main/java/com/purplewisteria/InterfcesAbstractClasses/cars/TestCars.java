package com.purplewisteria.InterfcesAbstractClasses.cars;
import java.util.Scanner;

import com.purplewisteria.InterfcesAbstractClasses.cars.benz.EClass;
import com.purplewisteria.InterfcesAbstractClasses.cars.benz.GLCSUV;
import com.purplewisteria.InterfcesAbstractClasses.cars.benz.MercedesBenz;

public class TestCars {
	
	static final boolean flag= true;
	
    public static void main(String[] args) {
    	
    	 Scanner input;
    	//  input = new Scanner(System.in);
    	//  String model = input.next();
    Car  mercedesBenz;
    	        
    	
      	
      
       	 mercedesBenz =  new GLCSUV("GLC SUV", "Diesel\n" + 
        			"GLC 220 d 4MATIC with an output of 125 kW (170 hp)\n" + 
        			"and 400 Nm maximum torque",  "world’s first 9-speed automatic"
        					+ " transmission with hydrodynamic torque converter"
        					+ " in the premium segment.(Automatic)");
       	  

       	 mercedesBenz =  new EClass("E Class", "V6-cylinder engine. The diesel engine comes with common-rail "
       	 		+ "direct injection and fuel preheating.",  
       	 		           "With nine forward gears, the 9G-TRONIC automatic transmission enables efficiency,"
       	 		           + " comfort and dynamism of an entirely new dimension.(Automatic)");
       
       	 
    	System.out.println( "Model:  " + ( (MercedesBenz) mercedesBenz).getModel() );
    	System.out.println("=================================");
    		
    	String engine= ((MercedesBenz) mercedesBenz).getEngineSpecification();
    	System.out.println("ENGINE:  " + engine);
    	
    			System.out.println( );
    			
    	String transmission= ((MercedesBenz) mercedesBenz).getTransmission();
    	System.out.println("TRANSMISSION:  " + transmission);
    	
    	
    	System.out.println("=================================");
    	 System.out.println("Start the Engine & Give Acceleration:");
    	 
    	  while (flag ) {
    	   input = new Scanner(System.in);
    	  double acceleration = input.nextDouble();
    	  
    	String carStatus = ( (MercedesBenz)mercedesBenz).move("START", acceleration);
    	System.out.println(carStatus);
    	  //input.close();
    	  }
    	
    }
}
