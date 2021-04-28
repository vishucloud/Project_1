package com.purplewisteria.Lambdas.fi.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
   public static void main(String[] args) {
	   
      List<Student> students = Arrays.asList(
    		  
            new Student("John", 1),
            new Student("Mark", 1.5),
            new Student("Rick", 5)
      );
      
     Consumer<Student>  consumer = (Student e) -> System.out.println(e.name);

      ConsumerUtil.acceptAllStudents(  students,  consumer   );
      
        // 'Consumer' FunctionalInterface, represents an operation that accepts a single input argument and returns no result
      ConsumerUtil.acceptAllStudents(students,   e -> {
    	                                                 if(e.getGpa() < 2) {
                                                          e.gpa += 1.5;
    	                                                 }
    	                                                 
    	                                                 
    	                                                 
    	                                                 
    	                                                 
    	                                                 
    	                                                 
    	                                                 
    	                                                 
                                                     }  
                         );
      
      ConsumerUtil.acceptAllStudents(students, e -> System.out.println(e.name + ": " + e.gpa));
        

      
   }

   

}