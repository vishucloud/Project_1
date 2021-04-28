package com.purplewisteria.InterfcesAbstractClasses.cars.benz;

public class GLCSUV extends MercedesBenz  {
	

	public GLCSUV(String model, String engineSpecification, String transmission) {
		
		super(model, engineSpecification, transmission);
		
	}

	@Override
	public String move(String mode, double acceleration) {
		
		engineOn (mode);
		changeGear( acceleration);
		
		 if(isMoving()) {
	            return "Car is moving with Acceleration " + getAcceleration() + " of Miles/Hour "   + " & with Speed of " + getSpeed();
	        }
		 else
			  return "Car is not moving! Give Acceleration";
	}

	
	 

}
