package com.purplewisteria.PetClinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// CONVERING OWNERS INTO JPA ENTITIES.. 

@Entity
@Table(name="owners")
public class Owner extends Person {
	
	@Column (name="address")
	private String address;
	
	@Column (name="city")
	private String city;
	
	@Column (name="telephone")
	private String telephone;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="owner")
	private Set <Pet> pets = new HashSet<>();

	
	  public Owner(Long id, String firstName, String lastName, String address, String city,
              String telephone, Set<Pet> pets) {
     super(id, firstName, lastName);
     this.address = address;
     this.city = city;
     this.telephone = telephone;

     if(pets != null) {
         this.pets = pets;
     }
 }

public Owner() {
		
	}
	
public Pet getPet(String name) {
    return getPet(name, false);
}

public Pet getPet(String name, boolean ignoreNew) {
    name = name.toLowerCase();
   
    for (Pet pet : pets) {
        if (!ignoreNew || !pet.isNew()) {
            String compName = pet.getName();
            compName = compName.toLowerCase();
            if (compName.equals(name)) {
                return pet;
            }
        }
    }
    return null;
}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	

}
