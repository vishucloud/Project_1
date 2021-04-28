package com.purplewisteria.naming_conventions_packages.wrapper_classes;

public class NumbersToAndFromString {

	    public static void main(String arg[])     {
	    	
//*********Converting between Primitive Type Values and Strings ***********************     
	            
	        float f = 156.8f;
	     
	        String s3 = Float.toString( f ); 
	        
	              System.out.println("converting a value of the corresponding primitive type(float) to a String object = " + s3);
	        
System.out.println("******************************************************************************************************");	
		

int i = 100;

String s7=   Integer.toString(i);

double  dd = 12.0d;

String ss = Double.toString(dd);
   
//*********Returning a String representation of a class object ***********************     
String f5 = "12.0d";

Float f1 = new Float (f5 );

double d= 9.4;
Double d1 = new Double(d);
          
			String s = d1.toString(); 
			
        System.out.println("Returning a String representation of a class object(Double): " + s);
       
	
//****************methods to convert from a String object to a primitive types********************    

        String s1 = "9.5f";
        
        try {
        float df = Float.parseFloat(s1);
        
     
        double d13 = Double.parseDouble(  s1 ); 
        System.out.println("d1 value  " +  d1);
        
        String s10 = "134";
        
        long l  = Long.parseLong(s10);
        
        }
        
        catch (NumberFormatException nfe) {   }
        
        System.out.println("Converting from a String object to a primitive type (double): " + d1);    
       
	    String c = "10";
        
        System.out.println("Converting from a String object to a primitive type (int): " + Integer.parseInt(c));
	       
	        }
	    }

