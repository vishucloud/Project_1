package com.purplewisteria.variables_datatypes_operators.primitives;

public class StringType {
	
	  public static void main(String[] args) {
		  
		  String  firstName ="Purple";
		  String lastName = "Wisteria";
		  
		  System.out.println("First Name: " + firstName);
		  System.out.println("Last Name: " + lastName);
		  
		  String website ="www.purplewisteria.com" + " \u00A9" + " 2018";
		  
		  System.out.println("Website: " + website);
		  System.out.println();
		  
		  String productPrice ="200.00";
		  
		  System.out.println("Product Price: " + "$ " + productPrice);
		  
		  
		  String firstProductPrice = "23.99";
		  double secondProductPrice = 29.99;
		  
		  System.out.println("Toatl Products Price: " + "$ " + firstProductPrice + "  " + secondProductPrice);
	  }

}
