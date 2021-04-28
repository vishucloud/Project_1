package com.purplewisteria.PetClinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="specialties")
public class Speciality extends BaseEntity {
	
	public Speciality(Long id, String description) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Speciality() {
		
	}

	
	@Column(name="description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
