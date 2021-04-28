package com.purplewisteria.naming_conventions_packages.nested_classes.nonstatic_class;

public class TestEmployee {

	  public static void main(String[] args) {
	     
		  Company c = new Company();
	      
		  c.newStarter("Chum", "IT");
	     
		  
		  System.out.println("**************************************************");
		  
	
	Company.Programmer newEmp  = c.new Programmer("Rick");
		    
	    System.out.println("Employee Name : " + newEmp.getEmployeeName() );
    
	  }
}
