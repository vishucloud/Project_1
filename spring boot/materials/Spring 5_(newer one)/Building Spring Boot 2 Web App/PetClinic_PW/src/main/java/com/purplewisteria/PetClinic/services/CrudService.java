package com.purplewisteria.PetClinic.services;

import java.util.Set;

// REFACTOR "SERVICES" TO COMMON INTERFACE... avoiding duplicate method codes..

public interface CrudService <T, ID> {
	
	public Set <T> findAll();
	
	public  T findById(ID id);
	
	public T save (T object);
	
	public void delete(T object);
	
	public  void deleteById (ID id);

}
