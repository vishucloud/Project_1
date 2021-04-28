package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism;

public class RoadBike extends Bike {

	private String suspension;
	private String driveTrain;
	private String crankset;
	private String steering;
	private String wheels;
	private String tyres;
	private String seatPost;

	public RoadBike(String bikeType, String model, double price, String size, double weight,
			String suspension, String driveTrain, String crankset, String steering, String wheels,
			String tyres, String seatPost
			       ) {
		//'super' is used to access/call the parent class members(variables & methods) ..except static areas..
		super(bikeType, model, price, size, "Aluminium 6061 T6", "BTWIN SPORT dual-pivot calliper brakes", weight);
		  
		// 'this' is used to call the current class members(variables & methods) ..except static areas..
		//when do we use 'this' ?
		 this.suspension = suspension;
		 this.driveTrain = driveTrain;
		 this.crankset =  crankset;
		 this.steering = steering;
		 this.wheels = wheels;
		 this.tyres = tyres;
		 this.seatPost = seatPost;
	}
       private void roadBikeFeatures() {
    	  System.out.println( "Suspension: " + suspension + "\n" + "Drive Train: " + driveTrain + "\n"  + "Crankset: " + crankset + "\n" + "Steering: "+ steering + "\n"  + "Wheels: " + wheels + "\n"  + "tyres: " + tyres + "\n"  + "seatPost: " + seatPost);
    	  System.out.println();
       }
	
	@Override
	public String showBikeDetails() {
		
		    bikeCategory("Road Bike Features: "); // inherited method...
		roadBikeFeatures();
		//'super' is commonly used with method overriding...
		// It's calling the method with the same name from the parent class..
		return  super.showBikeDetails(); // inherited method...
	}
	
	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		// 'this' is used to call the current class members(variables & methods) ..except static areas..
		this.suspension = suspension;
	}

	public String getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

	public String getCrankset() {
		return crankset;
	}

	public void setCrankset(String crankset) {
		this.crankset = crankset;
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getTyres() {
		return tyres;
	}

	public void setTyres(String tyres) {
		this.tyres = tyres;
	}

	public String getSeatPost() {
		return seatPost;
	}

	public void setSeatPost(String seatPost) {
		this.seatPost = seatPost;
	}
}
