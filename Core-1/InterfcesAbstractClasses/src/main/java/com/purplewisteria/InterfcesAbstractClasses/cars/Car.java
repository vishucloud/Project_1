package com.purplewisteria.InterfcesAbstractClasses.cars;


public  interface Car {
 
 public static final  double PI_VALUE = 3.14;
	
  int i=0;

 
   public abstract boolean engineOn(String mode);
    
   public abstract int transmission ( int gear);
    
  void changeGear(double speed);
    
  
   default String stop() {
    	return "";
    }
    
}
