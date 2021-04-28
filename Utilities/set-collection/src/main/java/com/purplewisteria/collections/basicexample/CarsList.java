package com.purplewisteria.collections.basicexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CarsList {   
	
     public static void main(String[] args) {
    	 
    	List <String >li;
    	
          // Create a list of strings  
    	//li = new Lists().showList( new ArrayList <String> () );
  
    	li =  new LinkedList <String> ();

       //   li =  new ArrayList <String>();
 
    // Print the list details               
 System.out.printf("After creation: Size = %d, Elements = %s%n",   li.size(), li);   
 
 // Add some Cars to the list    
 li.add("Jaguar XE"); 
 
 li.add("Fiat 124 Spider");
 
li.add("Fiat 124 Spider");   
 li.add("Nissan GT-R");   
 li.add("Alfa Romeo Giulia"); 
 
      li.add(3, "418 Spider"); 
      
   // li.add("12.0"); 
 
// Print the list details   
  System.out.printf("After adding 3 elements: Size = %d, Elements = %s%n",   li.size(),  li);
  
 li.remove("Nissan GT-R");
 // carsOf201.remove(12);
  
    // Print the list details          
 System.out.printf("After removing 1 element: Size = %d, Elements = %s%n", li.size(),  li);       
  // Clear all elements          
 
li.clear();           
      
  // Print the list details      
 System.out.printf("After clearing all elements: Size = %d, Elements = %s%n",   li.size(), li);  
 
 System.out.println();
 System.out.println("Using an iterator and the forEachRemaining() of the iterator ");
 
//Add some more Cars to the list    
li.add("Lincoln Continental");       
li.add("Toyota 86");        
li.add("Jaguar F-Pace");   
li.add("Toyota C-HR");   
li.add("Mazda CX-9");

 // Using an iterator and the forEachRemaining() of the iterator to print all elements of a list
// carsOf2017.iterator().forEachRemaining(System.out::println);  
 
 
 System.out.println();
  System.out.println("Iterate over all elements in the list");
 
//Iterate over all elements in the list
 Iterator<String> cars = li.iterator();
 
while(cars.hasNext() ) {
      // Get the next element from the list   
   String carName = cars.next();          
   // Print the name  
 System.out.println(carName); 
     
 // Remove the name if it is two characters       
 if (carName.length() == 9) {   
	 cars.remove();   
	 } 

}

System.out.println();
System.out.println("Using a for-each Loop to Iterate over all elements in the list");
// Print all elements of the names list 
	for(String carName : li) {               
		System.out.println(carName);   
	} 
	/*
	System.out.println();
	System.out.println("Using the forEach() Method of the Iterable to Iterate over all elements in the list");
    // Print all elements of the names list 
	carsOf2017.forEach(System.out::println);
   } 
   */
     }
}
