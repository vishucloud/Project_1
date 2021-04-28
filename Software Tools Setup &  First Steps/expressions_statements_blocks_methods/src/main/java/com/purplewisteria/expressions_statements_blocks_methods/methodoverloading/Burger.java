package com.purplewisteria.expressions_statements_blocks_methods.methodoverloading;

public class Burger { 
	
    private  int GuacCount = 0;
		private  int salsaCount = 0;
		private  int cokeCount=0;
		private  int chipsCount=0;
	    private  double guacamolePrice;
	    private  double salsaPrice;
	    
	    private double cokePrice;
	    private double chipsPrice;
	    
	    double burgerBasePrice = 3.00d;
	    double totalBurgerPrice;
    
	    
	    public double getGuacamolePrice() {
	        return this.guacamolePrice;
	    }

	    public double getSalsaPrice() {
	        return this.salsaPrice;
	    }
	    
	    public void resetCounters(){
        this.GuacCount = 0;
        this.salsaCount = 0;
        this.cokeCount=0;
        this.chipsCount =0;
	    }

	    public double addGualcamole(){
	       
	        this.GuacCount ++;
	        return GuacCount;
	    }
	    
	    public double addSalsa(){
	        
	        this.salsaCount ++;
	        return salsaCount;
	    }
	    
	    public int addCoke(int cokeCount){
	    	
		       this.cokeCount=cokeCount;
	       //cokeCount ;
	        return this.cokeCount;
	    }
	    
	    public int addChips(){
		       
		       this.chipsCount ++;
		        return this.chipsCount;
		    }
	    
	    public double getCokePrice() {
	        return this.cokePrice;
	    }

	    public double getChipsPrice() {
	        return this.chipsPrice;
	    }
	    
	// ************* OVER LOADED METHODS WITH SAME NAME BUT WITH DIFFERENT IMPLEMENTATIONS.... ********************
	    // Remember one method name... instead of multiple remembering method names.. 
	    // Improves code readability & re-usability
	    // Achieves consistency in method naming (Ex: println() )
	    // Gives flexibility to call a similar method with different types of data. 

		public double calculatePrice(double salsaPrice, double guacPrice) {
		
			this.guacamolePrice = guacPrice;
			this.salsaPrice = salsaPrice;
	        
	        if (this.GuacCount > 0) {

	            System.out.println(" Guacamole is Added ");
	            this.guacamolePrice = this.getGuacamolePrice() * this.GuacCount ;
	        }
	        else
	        	this.guacamolePrice = 0;

	         if (salsaCount > 0) {

	            System.out.println(" Salsa is Added ");
	             this.salsaPrice  = getSalsaPrice() * salsaCount;
	        }
	        else
	             this.salsaPrice = 0;

	        totalBurgerPrice =  this.burgerBasePrice + this.guacamolePrice + this.salsaPrice;
	       
	         resetCounters();
	         return totalBurgerPrice;
	    }

		
	    public double calculatePrice(double guacPrice, double salsaPrice, double cokePrice,  double chipsPrice) {
	    	
	    	this.guacamolePrice = guacPrice;
			this.salsaPrice = salsaPrice;
			this.cokePrice = cokePrice;
			this.chipsPrice = chipsPrice;
	    	 
			 if (GuacCount > 0) {

		            System.out.println(" Guacamole is Added ");
		            this.guacamolePrice  = this.getGuacamolePrice() * this.GuacCount ;
		        }
		        else
		        	this.guacamolePrice  = 0;

		         if (salsaCount > 0) {

		            System.out.println(" Salsa is Added ");
		             this.salsaPrice  = getSalsaPrice() * salsaCount;
		        }
		        else
		             this.salsaPrice = 0;
		         
		    	 if (cokeCount > 0) {

			            System.out.println(" Goke is Added ");
			            this.cokePrice = getCokePrice() * cokeCount ;
			        }
			        else
			            this.cokePrice = 0;
		    	 
		    	 if (chipsCount > 0) {

			            System.out.println(" Chips is Added ");
			            this.chipsPrice = getChipsPrice() * chipsCount ;
			        }
			        else
			            this.chipsPrice = 0;

		        totalBurgerPrice =  burgerBasePrice + this.guacamolePrice + this.salsaPrice + this.chipsPrice + this.cokePrice;
		       
		         resetCounters();
		         return totalBurgerPrice;
		    
	    }
	    
	    public String calculatePrice (String price) {
			
	   	 return price;
	   	}
	    
	
}
