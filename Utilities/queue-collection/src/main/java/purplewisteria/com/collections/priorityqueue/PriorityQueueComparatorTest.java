package purplewisteria.com.collections.priorityqueue;

import java.util.Queue; 
import java.util.PriorityQueue; 
import java.util.Comparator;

 public class PriorityQueueComparatorTest {     
   public static void main(String[] args) {   
	   
  int initialCapacity = 5;          
    // Comparator<Person> nameComparator =  Comparator.comparing(Person::getName);
     
Queue<Person> pq =   new PriorityQueue<Person> ( new Comparator <Person> () {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getId() - o2.getId();
	}
	
}    );               
 
pq.add(new Person(2, "John"));         
      
          pq.add(new Person(1, "Richard"));      
          pq.add(new Person(4, "Donna"));    
          pq.add(new Person(3, "Ken"));      
        //   pq.add(new Person(3, "Adam"));   

            System.out.println("Priority queue: " + pq);
          
            while (pq.peek() != null) {           
             System.out.println("Head Element: " + pq.peek());      
             
             
             pq.remove();            
            System.out.println("Removed one element from Queue");                      
            System.out.println("Priority queue: " + pq);         
       } 
            pq.add(new Person(6, "Rick"));
            pq.add(new Person(5, "Cory"));
            System.out.println("Priority queue: " + pq);  
       }
 }

