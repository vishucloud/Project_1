package com.purplewisteria.PetClinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.purplewisteria.PetClinic.model.BaseEntity;

// IMPLEMENTING MAP BASED SERVICES..

public abstract class AbstractMapService <T extends BaseEntity, ID extends Long> {
	
	protected Map <Long, T> map = new HashMap<>();
	
	// AUTO GENERATE MAP ID'S
	//=========================
	private Long getNextId() {
		
		Long nextId = null;
		try {
				nextId = Collections.max(map.keySet() ) + 1;
		}
		catch(NoSuchElementException nsee) {   // Handling NoSuchElementException...
			nextId = 1L;
		}
		return nextId;
	}
	
	Set<T> findAll() {
		
		return new HashSet<>(map.values());
	}
	
        T findById(ID id) {
        	return map.get(id);
        }
        
        T save (T object ) {
        	
        	if (object !=null )  {
        		
        		if ( object.getId() == null) {
        			 object.setId(getNextId());
        		}
            	map.put(object.getId(), object);
        	}
        	else {
        		throw new RuntimeException("Object cannot be null");
        	}
        		
        	return object;
        }
        
        void deleteById(ID id) {
        	map.remove(id);
        }
        
        void delete (T object ) {
        	map.entrySet().removeIf(entry -> entry.getValue().equals(object));
        }
}
