package purplewisteria.com.collections.DoubleEndedQueues;

import java.util.Deque; 
import java.util.LinkedList;
import java.util.NoSuchElementException;
 
public class DequeAsQueue {   
	
     public static void main(String[] args) {  
    	 
              // Create a Deque and add elements at its tail using
// addLast() or offerLast() method   
    	 //FIFO
             Deque<String> deque = new LinkedList<>();       
          
             
             deque.offerLast("Ken");
              deque.addLast("John");  
              deque.offerFirst("Richard");   
      System.out.println("Deque: " + deque);
      
      try {
                // Let's remove elements from the Deque until it is empty       
          while (deque.peekFirst() != null) {             
           System.out.println("Head Element: " + deque.peekFirst());
           
               deque.removeFirst();              
          System.out.println("Removed one element from Deque");             
          System.out.println("Deque: " + deque);   
             }
      }   catch (NoSuchElementException e) {      
          System.out.println("deque.getFirst(): Deque is empty.");      
  }
      
                // Now, the Deque is empty. Try to call its peekFirst(),        
         // getFirst(), pollFirst() and removeFirst() methods       
          System.out.println("deque.isEmpty(): " + deque.isEmpty());
                System.out.println("deque.peekFirst(): " + deque.peekFirst());      
                System.out.println("deque.pollFirst(): " + deque.pollFirst());
                
            try {                     
   String str = deque.getFirst();    
                    System.out.println("deque.getFirst(): " + str);            
    }            
            catch (NoSuchElementException e) {      
                  System.out.println("deque.getFirst(): Deque is empty.");      
          }
                try {               
         String str = deque.removeFirst();        
                System.out.println("deque.removeFirst(): " + str);    
            }           
                catch (NoSuchElementException e) {     
                	System.out.println("deque.removeFirst(): Deque is empty.");  
                	
          } 
                
       }
 }
