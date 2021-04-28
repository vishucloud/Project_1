package com.purplewisteria.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.purplewisteria.PetClinic.model.Speciality;
import com.purplewisteria.PetClinic.repositories.SpecialtyRepository;
import com.purplewisteria.PetClinic.services.SpecialtyService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService  implements SpecialtyService {

	  private final SpecialtyRepository specialtyRepository;

	    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
	        this.specialtyRepository = specialtyRepository;
	    }
	    
	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		 return specialtyRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		  specialtyRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		   specialtyRepository.deleteById(id);
	}


}
