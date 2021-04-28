package com.purplewisteria.ClassesConstructorsObjects;

public class LaptopDisplay  {
	
    public static void main( String[] args )    {
    	
    	/* Creating Objects:
    	   * As real world objects have two major characteristics, the state & behavior..
    	   * Java objects have similar characteristics, such as state & behavior
    	   * 
    	   * Software objects stores its state in fields (variables) & expose their behavior with methods
    	   * 
    	   */
    	    	Laptop hp   = new Laptop(); //Creating an Object
    	    	
    	    			// hp = null;    // 'null' is a default state...	
    	    	
    	    	hp.setProductCode("HPG023");
    	   //hp.productCode = "HP";
    	    	 hp.setProductName("HP Pavilion g6");
    	    	 hp.setPrice(800.00);
    	    	 hp.setPromoCode(true);
    	    	 
    	// Accessing the state variables / fields...    	 
    	  System.out.println("Product Name: " + hp.getProductName() + "  |  " + "Product Code: " + hp.getProductCode() +  "  |  " +
    			             "Product Price: "+ hp.getPrice() + "  |  " + "Promo Code: "+ hp.isPromoCode()
    			             );
    	    	
    	    	 Laptop del = new Laptop();
    	    	
    	    	 del.setProductCode("DE0E5") ;
    	    	 del.setProductName("DEL");
    	    	 del.setPrice(550.00);
    	    	 del.setPromoCode(false);
    	    	 
    	   // Accessing the state variables / fields...
    	    	  System.out.println("Product Name: " + del.getProductName() +  "  |  " + "Product Code: " + del.getProductCode() +  "  |  " +
    			             "Product Price: "+ del.getPrice() + "  |  " + "Promo Code: "+ hp.isPromoCode()
    			             );
    	        
    	    	 Laptop accer  = new Laptop();
    	    	 
    	    	 accer .setProductCode("AC03R") ;
    	    	 accer .setProductName("Accer");
    	    	 accer .setPrice(490.00);
    	    	 accer.setPromoCode(true);
    	    	 
    	   //Accessing the state variables / fields...
    	    	  System.out.println("Product Name: " + accer.getProductName() +  "  |  " + "Product Code: " + accer.getProductCode() +  "  |  " +
    			             "Product Price: "+ accer.getPrice() + "  |  " + "Promo Code: "+ hp.isPromoCode()
    			             );
    	    	  
    	    	  
        
    }
}
