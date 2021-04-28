package com.purplewisteria.variables_datatypes_operators.primitives;

public class WholeNumbersRange {
	
	  public static void main(String[] args) {
	
		  //PRIMITIVE DATA TYPES...
	/*
	 byte(8-bit): It has a minimum value of -128 and a maximum value of 127 (inclusive).	  
	 */
		  byte minByteValue= -125;
          byte maxByteValue=  127;
          
        System.out.println("Minimum & Maximum Values of bye Data Type Variable:");
        System.out.println("Minimum Value of Byte Variable Is: " + minByteValue);
        System.out.println("Maximum Value  Byte Variable Is : " + maxByteValue);
        System.out.println("*****************************************************");
	  
        /*
        short(16-bit ): It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
         */
		  short minShortValue= -32_768;
          short maxShortValue=  32_767;
          
      System.out.println("Minimum & Maximum Values of short Data Type Variable:");
      System.out.println("Minimum Value: " + minShortValue);
      System.out.println("Maximum Value: " + maxShortValue);
      System.out.println("*****************************************************");
        
        /*
	     int(32-bit): int data type is a 32-bit signed two's complement integer,
	     which has a minimum value of -2 power of 31 and a maximum value of 2 power of 31-1
	     −2,147,483,648 to 2,147,483,647
	    */
		  
              int minIntValue= -2_147_483_648;
              int maxIntValue=  2_147_483_647;
              
             //int empId = 123_344_455;
              
	        System.out.println("Minimum & Maximum Values of int Data Type Variable:");
	        System.out.println("Minimum Value: " + minIntValue);
	        System.out.println("Maximum Value: " + maxIntValue);
	        System.out.println("*****************************************************");
	        
	        /*
	        long(64-bit): The signed long has a minimum value of -2 power of 63 and 
	        a maximum value of 2 power of 63-1
	        */
	         long minLongValue= -92_23_37_20_36_85_47_75_807L;
              long maxLongValue=  92_23_37_20_36_85_47_75_807L;
              
	        System.out.println("Minimum & Maximum Values of long Data Type Variable:");
	        System.out.println("Minimum Value: " + minLongValue);
	        System.out.println("Maximum Value: " + maxLongValue);
	        
	        System.out.println("*****************************************************");        
	        
	  }
}
