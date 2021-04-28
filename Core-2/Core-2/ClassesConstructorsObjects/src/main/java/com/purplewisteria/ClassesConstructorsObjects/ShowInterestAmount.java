package com.purplewisteria.ClassesConstructorsObjects;

public class ShowInterestAmount {
	
	public static void main (String[] args) {

		InterestCalculator  interestCalculator = new InterestCalculator ();
		
	 
		 interestCalculator.setRateOfInterest(6.0d);
		 interestCalculator.setAmountOfDeposit(15000.00d);
		 
		 interestCalculator.showInterestAmount();
		 
		 /*	 interestCalculator.setRateOfInterest(6.50d);
		 interestCalculator.setAmountOfDeposit(10000.00d);
		 interestCalculator.showInterestAmount();
	*/	 
		
}
	
}