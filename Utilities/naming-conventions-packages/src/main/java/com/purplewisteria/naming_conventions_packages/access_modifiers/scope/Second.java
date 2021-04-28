package com.purplewisteria.naming_conventions_packages.access_modifiers.scope;

import com.purplewisteria.naming_conventions_packages.scope.AccessModifiersTest;

class Second extends AccessModifiersTest {  // sub class

    double showSalary(){
   	 setEmpid(2);
        return getSalary();  //  here default access variable "salary" is accessed from the sub class
      }
    
   long show () {
   	setEmpid(23);
		  return getEmpid(); 
	  }
    
    
    String getEmail () {
   	 
   	 return email;  
		  
	  }
    

String showEmpid() {
   	 
   	 return name; 
		  
	  }
  
}
