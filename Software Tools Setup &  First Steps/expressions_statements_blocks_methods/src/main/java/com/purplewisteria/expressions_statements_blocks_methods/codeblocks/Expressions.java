package com.purplewisteria.expressions_statements_blocks_methods.codeblocks;

public class Expressions {
	
	/*
	  An expression is a construct made up of variables, operators, and method invocations.
	  Operators may be used in building expressions, which compute values; expressions are the
	   core components of statements; statements may be grouped into blocks
	 */

	public static void main(String[] args) {
  /*
			References:
Expressions: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
Keywords:  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 */		
		
		
double fahrenheit = 98.4;  // A valid expression... as well as a Statement..
	    
		// converts the temperature in Fahrenheit to Celsius. The expression used is C = 5.0 * (F - 32.0) / 9.0 .     
        double celsius  = ( 5.0 * (fahrenheit - 32.0) ) / 9.0;   // Statement....which contains a valid expression
        
        System.out.println(fahrenheit + " F is same as " + celsius + " C.");  // Statement contains a valid expression
    
       
        //converts the temperature in Celsius to Fahrenheit. The expression will be F = (( 9.0 * C ) / 5.0) + 32.0
        
        double C = 36.9;  // A valid expression...
		
        		double F  = ( ( 9.0 * C ) / 5.0 ) + 32.0;  // Statement..which contains a valid expression
        
        		
        System.out.println(C + " C is same as " 
                      + F + 
                      " F.");  // Statement..including whitespace and indentation
    
		
		
	}

}
