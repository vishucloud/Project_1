package com.purplewisteria.Lambdas.fi.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerUtil {
	
	public static void acceptAllStudents(List<Student> student, Consumer<Student> printer) {
		   
	      for (Student e : student) {
	    	  
	         printer.accept(e);
	      }
	   }

}
