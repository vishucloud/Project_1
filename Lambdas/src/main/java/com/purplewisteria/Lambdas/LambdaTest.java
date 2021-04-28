package com.purplewisteria.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {
       
    	 new Thread( () -> {
                              System.out.println("Creating a Thread using Lambd Expression..");
                              System.out.println("We are passing Lambda Expression as an argument to the Thread's constructor..");
            
        }    ).start();

        new Thread( new Runnable() {

				@Override
				public void run() {
				 System.out.println("Creating a Thread using Anonymous Class...");
		         System.out.println("We are passing Lambda Expression as an argument to the Thread's constructor..");
				}
        	
           						}
        	);
      
       
        Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
   
        List<Employee> employees = new ArrayList<>();
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

     /*   Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getFirstName().compareTo(employee2.getFirstName());
            }
        });
*/
        System.out.println("************************************************************");
        
        Collections.sort(employees, (employee1,employee2) -> {  
        	                                                   return employee1.getFirstName().compareTo(employee2.getFirstName());
        	                                                 }
                         );
        
        for(Employee employee : employees) {
            System.out.println(employee.getFirstName());
        }
    }
}

