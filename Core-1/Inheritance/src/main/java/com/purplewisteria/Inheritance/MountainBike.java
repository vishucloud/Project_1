package com.purplewisteria.Inheritance;

public class MountainBike  extends Bike {
	
	private boolean unisexMountainBike;
	private String frontSuspension;
	private boolean rearSuspension;
	private String derailleur;
	private String handlebar;
	private String vBrakes;
	private String wheelsTyres;
	
	
	public MountainBike(String bikeType, String model, double price, String size, String frame, String brakes,
			double weight) {
		// Using 'super'...
		super(bikeType, model, price, size, frame, brakes, weight);
		// TODO Auto-generated constructor stub
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
