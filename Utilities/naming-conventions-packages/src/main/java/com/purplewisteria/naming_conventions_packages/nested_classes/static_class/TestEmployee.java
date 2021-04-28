package com.purplewisteria.naming_conventions_packages.nested_classes.static_class;

public class TestEmployee {

	 public static void main(String[] args) {
      
		 Company c  = new Company();
		 
		 
		 c.newStarter("Rick", "IT");
		 
		 System.out.println("**************************************************");
		 
          Company.NewEmployee newEmp =  new Company.NewEmployee("Cory");		 
  
             System.out.println("Employee Name : " + newEmp.getEmployeeName() ); 
 		    
System.out.println("**************************************************");

  System.out.println (
				     
				  Company.BusinessUnit.getBU()
				  
				 );
     
	 }
}
