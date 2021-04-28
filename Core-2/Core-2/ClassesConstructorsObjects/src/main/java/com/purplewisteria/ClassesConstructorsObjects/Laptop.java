package com.purplewisteria.ClassesConstructorsObjects;

/*
 Class: Fundamental component of object oriented programming in Java.
 Class : Template/Blueprint for an objects...
 Class: User-defined data type...
 And, create separate Java source file for each class declaration...but eclipse will create it for you.
 */

public class Laptop {
	
	// Member variables / Fields / Instance Variables... state of the Product
	/* Applying Encapsulation (hiding variables or methods), using 
	    'private' variable declarations.....
	    Encapsulation: The internal workings / representations of an object is hidden from outside the 
	    objects definition
	*/
	 private String productCode;
		private String productName;
		private double price;
		private boolean promoCode;
	
	
// Creating methods (setter/getter) for updating the model	

	public String getProductCode() {
		
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		
		this.productCode = productCode;
	}

	public boolean isPromoCode() {
		return promoCode;
	}

	public void setPromoCode(boolean promoCode) {
		this.promoCode = promoCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getPrice() {
		return this.price;
	}
	
	public void setProductName(String productName) {
		
		String pname = productName.toLowerCase();
		
		if ( (pname.equals ("hp pavilion") ) ||  (pname.equals ("del") ) ||
				(pname.equals ("accer") ) ) {			
			this.productName = productName;  // internal model field(instance variable of 'this' object) is assigned
		}
		else {
			
			this.productName = "Not Mentioned"; // internal model field(instance variable of 'this' object) is assigned
		}		
	}

	public void setPrice(double price) {
		
		
		if (price >500.00d) {
			this.price = price; // internal model field(instance variable of 'this' object) is assigned
	    }
		else {
			this.price = 0.00d; // internal model field(instance variable of 'this' object) is assigned
		}
	}

}
