package purplewisteria.com.collections.list;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedList;

 public class ListTest { 
       public static void main(String[] args) { 
    	   
               // Create a List and add few elements  
                List<String> list = new ArrayList<String>();
                
                List<Integer> list1 = new LinkedList<>();
                
                list.add("John");
                list.add("Richard"); 
               list.add("Donna"); 
               list.add("Ken");
             // list1.add(12);
              
             // list1.add(new Integer(12) );
               
System.out.println("List: " + list);

                int count = list.size();
                System.out.println("Size of List: " + count);
 
                // Print each element with its index 
                 for(int i = 0; i < count; i++) {   
                     String element =  list.get(i);
                        System.out.println("Index=" + i + ", Element=" + element);  
              } 
                 
                 List<String> subList = list.subList(1, 3);          
      System.out.println("Sub List 1 to 3(excluded): " + subList);
      
// Remove "Donna" from the list    
              list.remove("Donna"); // Same as list.remove(2);       
           System.out.println("List (after removing Donna): " + list);  
           
           
           
      } 
}
