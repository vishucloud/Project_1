package com.purplewisteria.collections.sorted.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet; 
import java.util.TreeSet;

 public class SortedSetComparatorTest { 
	 
       public static void main(String[] args) {
    	   
  // Create a sorted set sorted by id          
    //  SortedSet<Person> personsById =   new TreeSet<>(Comparator.comparing(Person::getId));
  //    SortedSet<Person> personsById =   new TreeSet<Person>( Comparator.comparing( (Person person) -> person.getId()   ) );
    	
    	//  SortedSet<Person> personsById =   new TreeSet<Person>(  (e1, e2) -> e1.getId() - e2.getId()   );
    	   
    	 SortedSet<Person> personsById =   new TreeSet<Person>(   new Comparator<Person>() {
					@Override
						public int compare(Person o1, Person o2) {
							return o2.getId()-o1.getId();
					      } 

}  ); 

                 // Add soem persons to the set   
      
      personsById.add(new Person(3, "Eve")); 
       personsById.add(new Person(1, "John"));      
          personsById.add(new Person(2, "Adam"));   
              
            personsById.add(new Person(4, "Donna"));  
              personsById.add(new Person(4, "Jack"));  // A duplicate Person
              
// Print the set          
      System.out.println("Persons by Id:");  
      
      Iterator<Person> persons =  personsById.iterator();
      
      while(persons.hasNext() ) {
            // Get the next element from the list   
         Person personName =   persons.next();          
         // Print the name  
       System.out.println(personName); 
    
      }
      
      
    // personsById.forEach(System.out::println);

// Create a sorted set sorted by name       
       //  SortedSet<Person> personsByName =   new TreeSet<>(Comparator.comparing(Person::getName)); 
     SortedSet<Person> personsByName =   new TreeSet<>(  Comparator.comparing(  (Person person) -> person.getName()  )); 
           personsByName.add(new Person(1, "John"));   
             personsByName.add(new Person(2, "Adam"));    
            personsByName.add(new Person(3, "Eve"));    
            personsByName.add(new Person(4, "Donna"));         
       personsByName.add(new Person(4, "Kip")); // Not a duplicate person
       
                System.out.println("Persons by Name: ");   
                
                personsByName.forEach(System.out::println);  
                
         
                
  }
 }
