package com.purplewisteria.PetClinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

//CREATING A BASE ENTITY

/* @MappedSuperclass 
The JPA standard specification defines the @MappedSuperclass annotation to allow 
an entity to inherit properties from a base class.
@MappedSuperclass only models inheritance in the OOP world.

Note: Now, our entities can extend the BasedEntity class and skip declaring the firstName & lastName
properties since they are inherited from the base class. 

From a database perspective, the @MappedSuperclass inheritance model is invisible
 since all the base class properties are simply copied to the database table 
 mapped by the actual entity class.
*/
@MappedSuperclass
public class Person extends BaseEntity {

	@Column(name="first_name")	
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
	public Person() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
