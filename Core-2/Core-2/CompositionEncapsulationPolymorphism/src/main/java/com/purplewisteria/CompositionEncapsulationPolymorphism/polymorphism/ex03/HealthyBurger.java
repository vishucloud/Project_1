package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex03;

public class HealthyBurger extends Hamburger{ 
	
	
	int GuacCount = 0;
    int salsaCount = 0;
    private  double GuacamolePrice;
    private  double salsaPrice;
	
	    public HealthyBurger( String meat, double HamburgerBasePrice) {
	        super("Brown Rye Bread Roll ", meat, HamburgerBasePrice);
	        this.GuacamolePrice = 5.00d;
	        this.salsaPrice = 5.00d;
	    }

	    public double getGuacamolePrice() {
	        return GuacamolePrice;
	    }

	    public double getSalsaPrice() {
	        return salsaPrice;
	    }
	    public void resetCounters(){
	        GuacCount = 0;
	        salsaCount = 0;
	    }

	    public double AddGualcamole(){
	       
	        GuacCount ++;
	        return GuacCount;
	    }
	    public double AddSalsa(){
	        
	        salsaCount ++;
	        return salsaCount;
	    }

	    @Override
	    public double calculatePrice() {
	        double Guacprice;
	        double Salsaprice;
	        double totalHealthyBurgerPrice;
	        double superBurgerPrice;

	        if (GuacCount > 0) {

	            System.out.println(" Guacamole is Added ");
	            Guacprice = getGuacamolePrice() * GuacCount ;
	        }
	        else
	            Guacprice = 0;

	         if (salsaCount > 0) {

	            System.out.println(" Salsa is Added ");
	             Salsaprice  = getSalsaPrice() * salsaCount;
	        }
	        else

	             Salsaprice = 0;

	        superBurgerPrice = super.calculatePrice();
	        totalHealthyBurgerPrice =  superBurgerPrice + Guacprice + Salsaprice;
	       
	         resetCounters();
	         return totalHealthyBurgerPrice;
	    }


}
