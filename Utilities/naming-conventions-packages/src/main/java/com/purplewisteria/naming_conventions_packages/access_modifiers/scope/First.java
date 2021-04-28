package com.purplewisteria.naming_conventions_packages.access_modifiers.scope;

import com.purplewisteria.naming_conventions_packages.scope.AccessModifiersTest;

class First {  // non-sub class
	
	
	   
	  double showSalary(){	 
		  
		  AccessModifiersTest cl=new AccessModifiersTest();
		  cl.setEmpid(23);
		  return  cl.getSalary();  //  here default access variable "salary" is accessed from non-sub class
 
	  }
	  
	  
	  long show () {
			
		//  return new MainClass().name;  
		  return new AccessModifiersTest().getEmpid();
		  
	  }
	  
	  String getEmail () {
		  AccessModifiersTest cl=new AccessModifiersTest();
		 // cl.getSalary();
	return cl.name;  
		  
	  }
	  
	 
/*
	  String getEmpID () {
		  return new MainClass().empid;  // illegal acces...
	  }
*/
}
