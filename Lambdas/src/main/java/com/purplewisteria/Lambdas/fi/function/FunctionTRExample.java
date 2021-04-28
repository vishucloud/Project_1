package com.purplewisteria.Lambdas.fi.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/*
 The below code shows example usage of apply() method where it converts/maps from a list 
 of Employee types to a list of Strings containing the names of all Employees. 
 */
public class FunctionTRExample{
	
	//  @Function - it's used to convert or transform from one object to another
	
  public static void main(String args[]){
	  
    Function<Employee, String> funcEmpToString= (Employee e)-> { return e.getFirstName(); };
    
    List<Employee> employeeList= 
     Arrays.asList(new Employee("Tom Jones", 45), 
    		 
      new Employee("Harry      Major", 25),
      new Employee("Ethan Hardy", 65),
      new Employee("Nancy Smith", 15),
      new Employee("Deborah Sprightly", 29));
    
    List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString);
    
     // empNameList.forEach(System.out::println);
    empNameList.forEach( employee -> {
    	                      System.out.println(employee); }
    	
                        );
    
  
    
 }
  /*
  The method convertEmpListToNamesList() iterates over all the employees in the employee list, 
  applies the function funcEmpToString to each of the Employee objects, 
  getting back the employee names in String format, which it puts in a 
  employee name list and sends it back to the main() method.
   */
 public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
	 
   List<String> empNameList=new ArrayList<String>(); 
   
   for(Employee emp:employeeList){
	   
     empNameList.add(funcEmpToString.apply(emp));
   }
   return empNameList;
  }
}





