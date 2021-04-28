package com.purplewisteria.userdefined.fi;

@FunctionalInterface
public interface Adder  {  // User defined Functional Interface..
	
	double add(double n1, double n2 );	
	
	
	
	/*
	   default public void doSomeWork(){
		    System.out.println("Doing some work in Adder interface impl...");
		  }
	  
	  
		  default public void doSomeOtherWork(){
		    System.out.println("Doing some other work in interface impl...");
		  }
		  
			String toString( );
		*/  

}

/*
You cannot have more than one method besides static, default and abstract methods
 that override methods in Object in your @FunctionalInterface

*/