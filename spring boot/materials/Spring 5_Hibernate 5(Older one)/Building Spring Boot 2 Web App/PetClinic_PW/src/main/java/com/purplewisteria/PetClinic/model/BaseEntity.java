package com.purplewisteria.PetClinic.model;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// CREATING A BASE ENTITY

/* @MappedSuperclass 
  The JPA standard specification defines the @MappedSuperclass annotation to allow 
   an entity to inherit properties from a base class.
  @MappedSuperclass only models inheritance in the OOP world.
  
  Note: Now, our entities can extend the BasedEntity class and skip declaring the @Id or
  property since they are inherited from the base class. 
   
   From a database perspective, the @MappedSuperclass inheritance model is invisible
    since all the base class properties are simply copied to the database table 
    mapped by the actual entity class.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public BaseEntity(Long id) {
		super();
		this.id = id;
	}

	public BaseEntity() {
	
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isNew () {
		return this.id == null;
	}

}
