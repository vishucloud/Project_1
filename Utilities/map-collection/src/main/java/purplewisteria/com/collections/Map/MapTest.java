package purplewisteria.com.collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {    
	public static void main(String[] args) { 
		
		// Create a map and add some key-value pairs 
		Map<String,String> map = new Hashtable<String,String>();     
		
		map.put("(342)113-9878", "John" );          
		map.put( "(245)890-9045", "Richard");     
		map.put( "(205)678-9823", "Donna");    
		map.put( "(205)678-9823", "Ken");
		map.put("(205)678-9823", "Ken" );
                // Print the details         
		printDetails(map);
		
            // Remove all entries from the map      
		map.clear();       
		
		System.out.printf("%nRemoved all entries from the map.%n%n");
		
		  // Print the details         
		printDetails(map);      
		
		}    
	
	public static void printDetails(Map<String,String> map) {   
		
		// Get the value for the "Donna" key     
		String name = map.get("(205)678-9823");
		 
		// Print details     
		System.out.println("Map: " + map);  
		System.out.println("Map Size: " + map.size());        
		System.out.println("Map is empty: " + map.isEmpty());    
		System.out.println("Map contains Donna key: " + map.containsKey("Donna"));   
		System.out.println("Name: " + name);       
		System.out.println("Donna key is removed: " + map.remove("Donna")); 
		
	}
}
 