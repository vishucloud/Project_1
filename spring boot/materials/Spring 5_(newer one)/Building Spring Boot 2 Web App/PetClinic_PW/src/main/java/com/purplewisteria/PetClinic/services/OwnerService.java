package com.purplewisteria.PetClinic.services;

import java.util.List;

import com.purplewisteria.PetClinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long> {
	
	Owner findByLastName (String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);

}
