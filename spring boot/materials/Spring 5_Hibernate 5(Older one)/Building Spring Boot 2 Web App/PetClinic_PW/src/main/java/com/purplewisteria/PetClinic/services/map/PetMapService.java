package com.purplewisteria.PetClinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.purplewisteria.PetClinic.model.Pet;
import com.purplewisteria.PetClinic.services.PetService;

//CREATING PET SERVICE MAP SERVICE

@Service // Implementing Spring Configuration
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService <Pet, Long> 
                                             implements PetService { 
	
	public Set <Pet> findAll() {
		  return super.findAll();
	  }
		
		public  Pet findById(Long id) {
			return super.findById(id);
		}
		
		public Pet save (Pet object) {
			return super.save(object);
		}
		
		public void delete(Pet object) {
			super.delete(object);
		}
		
		public  void deleteById (Long id) {
		       super.deleteById(id);
		}
		

}
