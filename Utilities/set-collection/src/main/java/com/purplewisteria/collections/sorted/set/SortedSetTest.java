package com.purplewisteria.collections.sorted.set;

import java.util.SortedSet;
import java.util.TreeSet;

 public class SortedSetTest {
	 
        public static void main(String[] args) { 
        	
               // Create a sorted set of some names 
                 SortedSet<String> sortedNames = new TreeSet<String>(); 
                 
               sortedNames.add("John");
                sortedNames.add("Adam");
                  sortedNames.add("Eve");
                sortedNames.add("Donna");
              //  sortedNames.add(new Integer());
                
            // Print the sorted set of names 
               System.out.println(sortedNames);   
               
               SortedSet<Integer> sortedNames1 = new TreeSet<Integer>(); 
               
               sortedNames1.add(12);
                sortedNames1.add(new Integer (13));
                  sortedNames1.add(1);
                sortedNames1.add(3);

                System.out.println(sortedNames1);   
            
               
     }
 }
