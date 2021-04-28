package com.purplewisteria.collections.mathematical.set;

import java.util.HashSet;
import java.util.Set;

import com.purplewisteria.collections.sorted.set.Dog;
public class HashSetTest {
	
       public static void main(String[] args) {
    	   
               // Create a set 
                Set<String> s1 = new HashSet<String>();
                
              // Add a few elements   
                
            
               // Create another set by copying s1         
      //  Set<Dog> s2 = new HashSet(s1);
        
 // Add a few more elements      
          s1.add("Ellen");    
          s1.add("Sara");  
          s1.add("Sara");   // one null is fine 
                s1.add(null); // Duplicate!!! No effect  
                
               // Print the sets     
          System.out.println("s1: " + s1); 
              System.out.println("s1.size(): " + s1.size());
              
             //  System.out.println("s2: " + s2);
              // System.out.println("s2.size(): " + s2.size());  
               
     }
}
