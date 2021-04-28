package com.purplewisteria.PetClinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.purplewisteria.PetClinic.model.Speciality;
import com.purplewisteria.PetClinic.model.Vet;
import com.purplewisteria.PetClinic.services.SpecialtyService;
import com.purplewisteria.PetClinic.services.VetService;

@Service // Implementing Spring Configuration

//CREATING VET MAP SERVICE
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService <Vet, Long> 
                        implements VetService  {  
                        	
	private SpecialtyService specialtyService; 
	
     	public VetMapService(SpecialtyService specialityService) {
	     	this.specialtyService = specialityService;
	    }
							public Set <Vet> findAll() {
                      		  return super.findAll();
                      	  }
                      		
                      		public  Vet findById(Long id) {
                      			return super.findById(id);
                      		}
                      		
                      		public Vet save (Vet object) {
                      			
                      			if(object.getSpecialities().size() > 0 ) {
                      				object.getSpecialities().forEach(speciality -> {
                      					 if(speciality.getId() == null ) {
                      						 Speciality savedSpeciality = specialtyService.save(speciality);
                      						speciality.setId(savedSpeciality.getId());
                      					 }
                      				}); 
                      			}
                      			return super.save(object);
                      		}
                      		
                      		public void delete(Vet object) {
                      			super.delete(object);
                      		}
                      		
                      		public  void deleteById (Long id) {
                      		       super.deleteById(id);
                      		}
                      		
                    	
    

}
