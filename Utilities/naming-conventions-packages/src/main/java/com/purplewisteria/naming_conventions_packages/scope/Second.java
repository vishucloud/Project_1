package com.purplewisteria.naming_conventions_packages.scope;



class Second extends AccessModifiersTest {  // sub class

    double showSalary(){
   	 setEmpid(2);
        return salary;  //  here default access variable "salary" is accessed from the sub class
      }
    
   long show () {
   	setEmpid(23);
		  return getEmpid(); 
	  }
    
    
    String getEmail () {
   	 
   	 return email;  
		  
	  }
    
/*
int showEmpid() {
   	 
   	 return empid; 
		  
	  }
  */ 
}
