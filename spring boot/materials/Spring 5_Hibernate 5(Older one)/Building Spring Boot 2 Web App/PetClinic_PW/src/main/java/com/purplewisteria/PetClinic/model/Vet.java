package com.purplewisteria.PetClinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="vets")
public class Vet extends Person {
	

public Vet(Long id, String firstName, String lastName, Set<Speciality> specialities) {
		super(id, firstName, lastName);
		this.specialities = specialities;
	}

public Vet() {
	
}

	/*
 The FetchType defines when Hibernate gets the related entities from the database
 
 The FetchType.EAGER tells Hibernate to get all elements of a relationship
  when selecting the root entity.
    	
  	The FetchType.LAZY tells Hibernate to only fetch the related entities from the 
  	database when you use the relationship
  
  	  Example: 
  	   In eager loading strategy, if we load the User data, it will also load up all orders
        associated with it and will store it in a memory.

  	  But, when lazy loading is enabled, OrderDetail data won’t be initialized and loaded 
  	  into a memory until an explicit call is made to it.
 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="vet_specialties",
	            joinColumns= @JoinColumn(name="vet_id"),
	            inverseJoinColumns= @JoinColumn(name="speciality_id")
	            
			)
	private Set <Speciality> specialities = new HashSet<>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	

}
