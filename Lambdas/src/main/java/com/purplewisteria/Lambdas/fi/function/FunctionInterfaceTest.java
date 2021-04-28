package com.purplewisteria.Lambdas.fi.function;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.function.DoubleFunction;

public class FunctionInterfaceTest {
	
	public static void main (String a[]) {
		
		// Takes an int and returns its square
		Function< Double, Double> square1 =   (x)   ->  x * x;
		
		System.out.println(square1.apply( 7.0 ) );
		
		
		Function<Employee, Integer > employee  = (x)   ->  {
			
			int nameLength   = x.getFirstName().length();
			  return nameLength;
			  
			}; 
			                
		System.out.println("Employee Name Length: " + employee.apply( new Employee( "Rick", 31)));
		
		
		IntFunction<Double> square2 = x -> (double) x * x;
		
		System.out.println("After Casting: "+ square2.apply(4));

		
		DoubleFunction<Double> square5 = s ->    s * s;
		System.out.println(square5.apply(5.0));	
		
		
		 ToIntFunction<String> toIntFunc = (str) -> str.length();
		 
		 int result = toIntFunc.applyAsInt("Monday");
		 System.out.println(result); //Output 6
		 
		 
			UnaryOperator<Integer> square4 = x -> x * x;
			System.out.println(square4.apply(5));
			
			UnaryOperator<String> i  = (x)-> x.toUpperCase();
		    
		    System.out.println(i.apply("Java Spring"));

	}

}
