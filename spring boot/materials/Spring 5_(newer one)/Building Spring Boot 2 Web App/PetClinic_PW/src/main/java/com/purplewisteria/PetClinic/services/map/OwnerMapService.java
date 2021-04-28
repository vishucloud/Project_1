package com.purplewisteria.PetClinic.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.purplewisteria.PetClinic.model.Owner;
import com.purplewisteria.PetClinic.model.Pet;
import com.purplewisteria.PetClinic.services.OwnerService;
import com.purplewisteria.PetClinic.services.PetService;
import com.purplewisteria.PetClinic.services.PetTypeService;

@Service // Implementing Spring Configuration

//CREATING OWNER SERVICE MAP SERVICE
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService <Owner, Long> 
                                           implements OwnerService {
	
// ENHANCING OWNERS WTH PETS & CONTACT INFO
	private final PetTypeService petTypeSerivce;
	private final PetService petService;

  public OwnerMapService(PetTypeService petTypeSerivce, PetService petService) {
		super();
		this.petTypeSerivce = petTypeSerivce;
		this.petService = petService;
	}

public Set <Owner> findAll() {
	  return super.findAll();
  }
	
@Override
	public  Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Owner save (Owner object) {
		
		if (object !=null ) {
			if (object.getPets() != null) {
				 object.getPets().forEach( pet -> {
					 
					 if(pet.getPetType() !=null ) {
						 
						 if (pet.getPetType().getId() == null) {
							 pet.setPetType(petTypeSerivce.save(pet.getPetType()));
						 }
						 
					 } else {
						 throw new RuntimeException ( "Pet Type is required!");
					 }
					  if(pet.getId() ==null ) {
						  Pet savedPet = petService.save(pet);
						  pet.setId(savedPet.getId());
					  }
				 });
			}
		return super.save( object);
		}
		else {
			return null;
		}
	}
	
	public void delete(Owner object) {
		super.delete(object);
	}
	
	public  void deleteById (Long id) {
	       super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
