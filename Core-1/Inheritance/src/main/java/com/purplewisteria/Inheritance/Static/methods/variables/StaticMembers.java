package com.purplewisteria.Inheritance.Static.methods.variables;

public class StaticMembers {
	
	 public static final double RATE_OF_INTEREST = 6.50d;
	 
	// public static final  double PI_VALUE = 3.14d;
	 
/*  Should a method be static or instance method ?
     Answer: Does your method use any fields(instance variables) or instance methods?
     If you reply is 'YES' then use instance methods or 'NO' then use static methods..
*/
	    public static double  calculateInterest(double amountOfDeposit, double rateOfInterest, double tenure) {
		
	    	return    amountOfDeposit * (1 + (rateOfInterest/100)  * tenure) ;
	    }
}
/*

Calculation:
First, converting R percent to r a decimal
r = R/100 = 6.5%/100 = 0.065 per year.

Solving our equation:
A = 10000(1 + (0.065 × 3)) = 11950 
A = $11,950.00

*/