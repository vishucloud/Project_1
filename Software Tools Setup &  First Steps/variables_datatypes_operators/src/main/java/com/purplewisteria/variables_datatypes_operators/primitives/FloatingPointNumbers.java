package com.purplewisteria.variables_datatypes_operators.primitives;

public class FloatingPointNumbers {
	
	 public static void main(String[] args) {
		 
		 //PRIMITIVE DATA TYPES...
		 
		// float floatValue = (float) 5.4;
		 float floatValue =  5.40F;
		// double doubleValue = 5.4;
		 double doubleValue = 5.4D;
		 
		 
		 /*
		 float(32-bit): 
		      Range of values that can be stored: 3.4e−038 to 3.4e+038	  
		 */
			 
		  double numOfPounds =325.55d;
		  	  
	        double kilograms = numOfPounds * 0.45359237d;
	        
	        System.out.println(numOfPounds + " is equal to  " + kilograms + "Kilograms" );
	        
	        
	        
	        float pounds =325.55f;
	        float kgs =  pounds * 0.45359237f;
	        System.out.println("Kilograms = " + kgs);

	        
	        
	        //CASTING....
	       float result = (float) (numOfPounds * 0.45359237d);
	       System.out.println("Result after converting double into float" + result );

	      int res = (int) (numOfPounds * 0.45359237d);
	      
	      result = res;
	 }

}




       