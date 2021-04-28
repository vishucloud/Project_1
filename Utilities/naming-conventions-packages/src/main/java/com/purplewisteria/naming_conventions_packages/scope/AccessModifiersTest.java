
package com.purplewisteria.naming_conventions_packages.scope;   // �package� statement with package name ( pack1) is declared here...

import java.util.List;

import java.util.ArrayList;

    public class AccessModifiersTest {  // super class..
	 
     
	private long empid= 101;  // Here, the instance variable has private access.
      
     double salary= 50000; // Here, the instance variable has default access.
     
      public String name="xyz"; // Here, the instance variable has public access
      
      protected  String email= "yyy"; // Here, the instance variable has protected access

      long getEmpid(){
    		
    		return empid;  //  here private variable "empid" can be accessed through methods within the class
      }
  
    public void setEmpid(long empid){
        
    	    this.empid=empid;  //   here private variable "empid" can be set or modified through methods within the class
         }
     
   protected double getSalary(){
	   
	 // List list =  new ArrayList();
     return salary;  //  here default access variable "salary" is accessed from the same class
      
     }
   }  // MainClass ends here.


 
