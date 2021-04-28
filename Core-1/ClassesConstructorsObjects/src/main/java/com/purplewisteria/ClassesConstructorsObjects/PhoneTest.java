package com.purplewisteria.ClassesConstructorsObjects;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone samsung = new Phone ();
		
		samsung.setBrandCode("SMG098");
		samsung.setBrandName("SAMSUNG Galaxy 657");
		
		// Accessing the state variables / fields...    	 
  	  System.out.println("Brand Name: " + samsung.getBrandName() + "  |  " + "Brand Code: "
		                             + samsung.getBrandCode()
  			             );
  	  
  	System.out.println("************************************************");
  	  
  	Phone iphone = new Phone ();
	
	iphone.setBrandCode("IU098");
	iphone.setBrandName("IPHONE 6S");
	
	// Accessing the state variables / fields...    	 
	  System.out.println("Brand Name: " + iphone.getBrandName() + "  |  " + "Brand Code: "
	                             + iphone.getBrandCode()
			             );

	}

}
