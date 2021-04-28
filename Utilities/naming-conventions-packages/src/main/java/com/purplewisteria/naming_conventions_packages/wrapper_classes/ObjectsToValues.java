package com.purplewisteria.naming_conventions_packages.wrapper_classes;

public class ObjectsToValues {

	public static void main(String[] args) {

//***********************Converting Objects to Values**********************
		double df = 9.4d;
		Double d = new Double(df);
        
    	double prim_d =  d.doubleValue(); 
           System.out.println("Value converted to double: " + prim_d);
           
        byte b = d.byteValue(); 
           System.out.println("Value when converted to bye: " + b);
           
        int i = d.intValue();
            System.out.println("Value when converted to int: " + i);
            
        short st = d.shortValue(); 
            System.out.println("Value when converted to short: " + st);
            
        int l = (int) d.longValue();
            System.out.println("Value when converted to long: " + l);
            
 int intVal = 123456;
            		Integer i1 = new Integer(intVal);
            		
            				System.out.println("Integer i value is converted into byte : " + i1.byteValue());
            				
            			double dd = i1.doubleValue();
            				i1.intValue();
            				
            				Number f;		
            				
            				float floatVal =789.00f;
            				
            		 f = new Float(floatVal);
            			
            				System.out.println("Float f value is converted into double : " + f.longValue()); 
            				System.out.println("Float f value is converted into short : " + f.shortValue());
            				
            	    f = new Long(654321);
            
            			System.out.println("Long l value is converted into float : " + f.doubleValue()); 
                        System.out.println("Integer i value is converted into long : " + f.longValue());
            
            
        

	}

}
