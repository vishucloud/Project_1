package com.purplewisteria.ControlFlow.whiledowhile;

public class WhileLoop {

	public static void main(String[] args) {
		
		System.out.println("while loop LOOPING STATEMENT RESULT...");

	    int x = 5;
	      
	    while (x > 1) { // Here, the conditional expression (x<5) must return  a boolean (true/false) result.
	    	           // And, the body of the while loop will be executed if the conditional expression  will be true.
	    	 
	        System.out.println("Now the value of x is: " + --x); // body of the while loop..
	       
	            // body of the while loop..
	         } // while loop ends here...
	    System.out.println("------------------------------------------ "); 
	   
		int i=0;
		boolean b = true;
		
	    while (b) { 
	    
	    	if(i==3 )
	    		break;
	    	System.out.println("Now the value of i is: "  + ++i); 
	    	
	    }
	    
	}
}
