package com.purplewisteria.naming_conventions_packages.scope;

class First {  // non-sub class

	   
	  double showSalary(){	 
		  
		  AccessModifiersTest cl=new AccessModifiersTest();
		  cl.setEmpid(23);
		  return  cl.salary;  //  here default access variable "salary" is accessed from non-sub class
 
	  }
	  
	  
	  long show () {
			
		//  return new MainClass().name;  
		  return new AccessModifiersTest().getEmpid();
		  
	  }
	  
	  String getEmail () {
		  AccessModifiersTest cl=new AccessModifiersTest();
		 // cl.getSalary();
		 // return new MainClass().email;  
		  return "";
	  }
	  
	 
/*
	  String getEmpID () {
		  return new MainClass().empid;  // illegal acces...
	  }
*/
}
