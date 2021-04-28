package purplewisteria.com.collections.simplequeue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueTest {
	
       public static void main(String[] args)   {
    	   
               Queue<String> queue = new LinkedList<>();  
            
               queue.add("John");  
            
            
          // offer() will work the same as add() 
                queue.offer("Richard");
                queue.offer("Donna");
               queue.offer("Ken");
              System.out.println("Queue: " + queue);
              queue.offer("Rick");
              
              //System.out.println("Queue: " + queue);   
 // Let’s remove elements until the queuee is empty 
              while (queue.peek() != null) {
                      System.out.println("Head Element: " + queue.peek()); 
                      String name = queue.peek();
                      // condition..
                       
                    	 queue.remove(); 
                       
                      
               
        System.out.println("Removed one person from Queue "  + name);              
        System.out.println("Queue: " + queue);    
           }
              
    // Now Queue is empty. Try  calling the peek(),     
           // element(), poll() and remove() methods    
             System.out.println("queue.isEmpty(): " + queue.isEmpty());
             
  System.out.println("queue.peek(): " + queue.peek());   
  System.out.println("queue.poll(): " + queue.poll());
  
            try {                      
 String str = queue.element();  
                     System.out.println("queue.element(): " + str); 
                     
          } 
               
          catch (NoSuchElementException e) {   
        	  
               System.out.println("queue.element(): Your Queue is empty.");     
        }
               
try {            
           String str1 = queue.remove();     
                  System.out.println("queue.remove(): " + str1);  
            }         
 catch (NoSuchElementException e) {                     
            	 System.out.println("queue.remove(): One more time, I am saying that your Queue is empty.");        
      }

   }
}
