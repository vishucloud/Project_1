package purplewisteria.com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
       public static void main(String[] args) {  
    	   
        List<String> list = new ArrayList<>();      
         list.add("John");        
       list.add("Richard");      
         list.add("Donna");   
            list.add("Ken");
  System.out.println("List: " + list);
  
          // Get the list iterator 
              ListIterator<String> iterator = list.listIterator();
              
             // Iterator<String> iterato = list.iterator();
              
               System.out.println(); 
              System.out.println("List Iterator in forward direction:");

               while (iterator.hasNext()) {     
                  int index = iterator.nextIndex(); 
                      String element = iterator.next();  
                      
                     System.out.println("Index=" + index + ", Element=" + element);     
          }
               
               System.out.println();    
           System.out.println("List Iterator in backward direction:");
           
               // Reuse the iterator to iterate from the end to the beginning      
           while (iterator.hasPrevious()) {   
        	   
                 int index = iterator.previousIndex();     
                  String element = iterator.previous();           
            System.out.println("Index=" + index + ", Element=" + element); 
            
         }  
     }
}
