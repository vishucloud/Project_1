package com.purplewisteria.PetClinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="types")
public class PetType extends BaseEntity {

	@Column(name="name")
	private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

	public PetType() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  name;
	}
	
	
	
}
