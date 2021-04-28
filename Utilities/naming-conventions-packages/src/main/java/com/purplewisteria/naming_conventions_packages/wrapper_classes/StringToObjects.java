package com.purplewisteria.naming_conventions_packages.wrapper_classes;

public class StringToObjects {
	
	public static void main(String arg[])     {
	
    //***************************Converting a String to an object of the class type**********************
		String s6 = "25.00f";
   
        Float f1 = Float.valueOf(s6);
        
       float ff = f1.floatValue();
        
        System.out.println("Converting a String to an object of the class type(Float): " + f1);
          
          
          String s7 = "25.00d";
	        
          Double d1 = Double.valueOf(s7);
          
          double d = d1.doubleValue();
                        int ii = d1.intValue();
          

          String s9 = "25";
          
         double dd = Double.parseDouble(s9);
          
          System.out.println("Converting a String to an object of the class type(Double): " + d1);
          
	}
}
