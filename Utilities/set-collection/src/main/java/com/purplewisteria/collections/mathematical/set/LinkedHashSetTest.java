package com.purplewisteria.collections.mathematical.set;

import java.util.Set;
import java.util.LinkedHashSet; 
import java.util.HashSet;
import java.util.Iterator;

 public class LinkedHashSetTest {
	 
        public static void main(String[] args) {
        	
        	Set<String> carsOf2017;
        	
             carsOf2017 = new LinkedHashSet<>();  
                carsOf2017.add("Jaguar XE");
                carsOf2017.add("Fiat 124 Spider");   
                carsOf2017.add("Nissan GT-R");  
                carsOf2017.add("Alfa Romeo Giulia"); 
                carsOf2017.add("Lincoln Continental"); 
                carsOf2017.add("Jaguar F-Pace"); 
                carsOf2017.add("Mazda CX-9"); 
                carsOf2017.add("Mazda CX-9"); 
                
                Iterator<String> cars =  carsOf2017.iterator();
                
                while(cars.hasNext() ) {
                      // Get the next element from the list   
                   String carName =   cars.next();          
                   // Print the name  
                 System.out.println("LinkedHashSet: " + carName); 
              
                }
               
                // Add the same elements to this set            
          carsOf2017 = new HashSet<>();
          	carsOf2017.add("Jaguar XE");
          	carsOf2017.add("Fiat 124 Spider");   
          	carsOf2017.add("Nissan GT-R");  
          	carsOf2017.add("Alfa Romeo Giulia"); 
          	carsOf2017.add("Lincoln Continental"); 
          	carsOf2017.add("Jaguar F-Pace"); 
          	carsOf2017.add("Mazda CX-9"); 
        	carsOf2017.add("Mazda CX-9"); 
             
           System.out.println("HashSet: " + carsOf2017);
           
           //System.out.println("s1.equals(s2): " + s1.equals(s2));
           
    }
 }
