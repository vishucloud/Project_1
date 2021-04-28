package com.purplewisteria.PetClinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.purplewisteria.PetClinic.model.Vet;
import com.purplewisteria.PetClinic.repositories.VetRepository;
import com.purplewisteria.PetClinic.services.OwnerService;
import com.purplewisteria.PetClinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService  implements VetService {

	  private final VetRepository vetRepository;

	    public VetSDJpaService(VetRepository vetRepository) {
	        this.vetRepository = vetRepository;
	    }

	@Override
	public Set<Vet> findAll() {
		 Set<Vet> vets = new HashSet<>();
	        vetRepository.findAll().forEach(vets::add);
	        return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		 return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		 vetRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
		
	} 
	
}
