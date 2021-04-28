package com.purplewisteria.PetClinic.services.map;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.purplewisteria.PetClinic.model.Speciality;
import com.purplewisteria.PetClinic.services.SpecialtyService;

// CREATING SPECIALITY MAP SERVICE

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService  {

	@Override
	public Set<Speciality> findAll() {
		
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
		
	}
	

}
