package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism;

public class MountainBike extends Bike{
	
	private boolean unisexMountainBike;
	private String frontSuspension;
	private boolean rearSuspension;
	private String derailleur;
	private String handlebar;
	private String vBrakes;
	private String wheelsTyres;
	
	public MountainBike( String bikeType, String model, double price, String size, double weight,
						boolean unisexMountainBike, String frontSuspension, boolean rearSuspension, String derailleur,
			            String handlebar, String vBrakes, String wheelsTyres) {
		
		//'super' is used to access/call the parent class members(variables & methods) ..except static areas..
		super(bikeType, model, price, size, "Alpha Silver Aluminum", "Hydraulic Brakes", weight);
		  
		// 'this' is used to call the current class members(variables & methods) ..except static areas..
		//when do we use 'this' ?
		
		this.unisexMountainBike = unisexMountainBike;
		this.frontSuspension = frontSuspension;
		this.rearSuspension = rearSuspension;
		this.derailleur = derailleur;
		this.handlebar = handlebar;
		this.vBrakes = vBrakes;
		this.wheelsTyres = wheelsTyres;
		
	}
	
	  private void mountainBikeFeatures() {
    	  System.out.println( "UnisexMountainBike: " + unisexMountainBike + "\n" + "Front Suspension: " + frontSuspension + "\n"  + "Rear Suspension: " + rearSuspension + "\n" + "Derailleur: "+ derailleur + "\n"  + "Handlebar: " + handlebar + "\n"  + "vBrakes: " + vBrakes + "\n"  + "Wheels Tyres: " + wheelsTyres);
    	  System.out.println();
       }
	
	@Override
	public String showBikeDetails() {
		
		    bikeCategory("Mountain Bike Features: "); // inherited method...
		mountainBikeFeatures();
		//'super' is commonly used with method overriding...
		// It's calling the method with the same name from the parent class..
		return  super.showBikeDetails(); // inherited method...
	}
	
	
	public boolean isUnisexMountainBike() {
		return unisexMountainBike;
	}
	public void setUnisexMountainBike(boolean unisexMountainBike) {
		// 'this' is used to call the current class members(variables & methods) ..except static areas..
		this.unisexMountainBike = unisexMountainBike;
	}
	public String getFrontSuspension() {
		return frontSuspension;
	}
	public void setFrontSuspension(String frontSuspension) {
		this.frontSuspension = frontSuspension;
	}
	public boolean isRearSuspension() {
		return rearSuspension;
	}
	public void setRearSuspension(boolean rearSuspension) {
		this.rearSuspension = rearSuspension;
	}
	public String getDerailleur() {
		return derailleur;
	}
	public void setDerailleur(String derailleur) {
		this.derailleur = derailleur;
	}
	public String getHandlebar() {
		return handlebar;
	}
	public void setHandlebar(String handlebar) {
		this.handlebar = handlebar;
	}
	public String getvBrakes() {
		return vBrakes;
	}
	public void setvBrakes(String vBrakes) {
		this.vBrakes = vBrakes;
	}
	public String getWheelsTyres() {
		return wheelsTyres;
	}
	public void setWheelsTyres(String wheelsTyres) {
		this.wheelsTyres = wheelsTyres;
	}
	
	
	
}
