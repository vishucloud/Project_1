package com.purplewisteria.ControlFlow.conditionalstatements;

public class IfElseIfVsSwitch {

	public static void main (String a[] ) {
	
		
	    int x = 1;
	      
	    while (x < 5) { 
	    				switch(x)  {
    
	    					case  1:
	    					
	    							System.out.println("Value of x is " + x);
	    						break;
	    							// FALL - THROUGH, NO BREAK HERE
	    					case  2:
	    					case  3:
	    						System.out.println("Value of x is " + x);
	    						System.out.println("Value of x is " + x);
	    					
      					break;
     
	    					case 4:
	    						System.out.println("Value of x is " + x);
	    					break;
        
	    					default:
	    						System.out.println("Value of x is " + x);
	    						
	    				}	
	    				
	    				x++;
 
	    }
	    
	    
	}
}
