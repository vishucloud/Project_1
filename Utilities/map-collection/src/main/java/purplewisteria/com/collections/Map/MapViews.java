package purplewisteria.com.collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map; 
import java.util.Set;
import java.util.Collection;

public class MapViews {
	public static void main(String[] args) {   
		
		Map<String, String> map = new LinkedHashMap<String, String>(); 
		
		map.put("John", "(342)113-9878");           
		map.put("Richard", "(245)890-9045");       
		map.put("Donna", "(205)678-9823");        
		map.put("Ken", "(205)678-9827");
		map.put("Ken", "(205)678-9823");
		
	//	map.put(12, "(205)678-9823");
		
                System.out.println("Map: " + map.toString());
 
                // Print keys, values, and entries in the map 
                listKeys(map);          
                listValues(map);      
                listEntries(map);     
                }
 
        public static void listKeys(Map<String,String> map) {      
        	System.out.println("Key Set:");         
        	
        	Set<String> keys = map.keySet();  
        	
     Iterator <String> iterator =    keys.iterator();
        	
     while( iterator.hasNext()) {
    	 
    	 String key = (String) iterator.next();
    	 
    	 System.out.println(key );   
    	 
     }
        
        	   
        	}

 
        public static void listValues(Map<String,String> map) {    
        	System.out.println("Values Collection:");   
        	
        	Collection<String> values = map.values(); 
        	
        	  Iterator <String>iterator =    values.iterator();
          	
        	     while( iterator.hasNext()) {
        	    	 
        	    	 String value= (String) iterator.next();
        	    	 
        	    	 System.out.println(value );   
        	    	 
        	     }   
        	System.out.println();       
        	}
        
        public static void listEntries(Map<String,String> map) {     
        	System.out.println("Entry Set:");
        
        // Get the entry Set   
        	Set < Map.Entry <String, String>  >  entries = map.entrySet();     
        	
          
        	
        	Iterator <Map.Entry <String, String>>iterator =    entries.iterator();
          	
   	     while( iterator.hasNext()) {
   	    	 
   	    	Map.Entry<String, String> entry = (Map.Entry <String, String>) iterator.next();
   	    	String key = entry.getKey(); 
   	    	 System.out.println(key );   
   	    	String value = entry.getValue();    
   	     System.out.println(value ); 
   	     }   
   	System.out.println();       
   	
        	} 
        }
 