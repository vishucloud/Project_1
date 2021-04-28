package com.purplewisteria.InterfcesAbstractClasses.cars.benz;

import com.purplewisteria.InterfcesAbstractClasses.cars.Car;

public abstract class MercedesBenz implements Car {
	
      private String model;
	private int speed;
    private boolean isMoving;
    private double acceleration;
    
    private String engineSpecification;
    private String transmission;
    
    public MercedesBenz () {
    	
    }
    
    
    public MercedesBenz (String model, String engineSpecification, String transmission) {
    	this.engineSpecification = engineSpecification;
    	this.transmission =  transmission;
    	this.model = model;
    	this.acceleration = 0.00d;
    	this.speed = 0;
    }
    
    public String getModel() {
		return model;
	}

	public String getEngineSpecification() {
		return engineSpecification;
	}

	public String getTransmission() {
		return transmission;
	}

	public boolean isMoving() {
    	return isMoving;
    }

    public void setMoving(boolean isMoving) {
    	this.isMoving = isMoving;
    }
    
    public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}
	
   public int getSpeed() {
			return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public boolean engineOn(String mode) {
		
		if(mode.equalsIgnoreCase("start")) {
		  return true;
		}
		else
			return false;
		}

	@Override
	public int transmission(  int gear ) {
		    if( ( gear > 0)  ) {
		    	this.speed=gear;
		    }
		return speed;
	}


	
	@Override
public void changeGear(double acceleration) {

    this.acceleration = this.getAcceleration() + acceleration;
    
    if(this.acceleration ==0) {    	
    							this.stop();
    							this.isMoving= false;
    							this.transmission(1);
    								
    } else if(this.acceleration >0 && this.acceleration <=20) {    	
    							isMoving= true;
    							this.transmission(2);
    						
    } else if(this.acceleration >20 && this.acceleration <=40) {    	
    							isMoving= true;
    							this.transmission(3);
    							
    } else if(this.acceleration >40 && this.acceleration <=60) {
    							isMoving= true;
    							this.transmission(4);
    						
    } else if(this.acceleration >60 && this.acceleration <=80) {
    							isMoving= true;
    							this.transmission(5);
    }
    else if(this.acceleration >80 && this.acceleration <=100) {
    							isMoving= true;
    							this.transmission(6);
      }
    else if(this.acceleration >100 && this.acceleration <=120) {
		isMoving= true;
		this.transmission(7);
     }
    else if(this.acceleration >120 && this.acceleration <=140) {
		isMoving= true;
		this.transmission(8);
     }
    else if(this.acceleration >140 && this.acceleration <=160) {
		isMoving= true;
		this.transmission(9);
     }
  }


	public abstract String move(String mode, double acceleration) ;
	


}


