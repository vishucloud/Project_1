package com.purplewisteria.PetClinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.purplewisteria.PetClinic.model.Owner;
import com.purplewisteria.PetClinic.model.Pet;
import com.purplewisteria.PetClinic.model.PetType;
import com.purplewisteria.PetClinic.model.Speciality;
import com.purplewisteria.PetClinic.model.Vet;
import com.purplewisteria.PetClinic.model.Visit;
import com.purplewisteria.PetClinic.services.OwnerService;
import com.purplewisteria.PetClinic.services.PetTypeService;
import com.purplewisteria.PetClinic.services.SpecialtyService;
import com.purplewisteria.PetClinic.services.VetService;
import com.purplewisteria.PetClinic.services.VisitService;
import com.purplewisteria.PetClinic.services.map.OwnerMapService;
import com.purplewisteria.PetClinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
	private final VisitService visitService;
		
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, 
			SpecialtyService specialtyService, VisitService visitService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
		this.visitService = visitService;
	}

	@Override
	public void run(String... args) throws Exception {	
		
		int count = petTypeService.findAll().size();
		
		if (count== 0) {
         loadData();
		}
	}
	
	private void loadData() {
		
		PetType dog = new PetType();
		dog.setName("Dog");		
		PetType savedDogPetType = petTypeService.save(dog);		

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		// ADDING SPECIALTIES TO VETS ON STARTUP...
		     Speciality radiology = new Speciality();
		     radiology.setDescription("Radiology");
		     Speciality savedRadiology = specialtyService.save(radiology);
		
		     Speciality surgery = new Speciality();
		     surgery.setDescription("Surgery");
		     Speciality savedSurgery = specialtyService.save(surgery);
		     
		     Speciality dentistry = new Speciality();
		     dentistry.setDescription("Dentistry");
		     Speciality savedDentistry = specialtyService.save(dentistry);
		
		Owner owner1 = new Owner();
			owner1.setFirstName("Rick");
			owner1.setLastName("Coery");
			owner1.setAddress("346 Brikeral");
			owner1.setCity("346 NJ");
			owner1.setTelephone("345-3467-0808");	
			
			Pet ricksPet = new Pet();
			    ricksPet.setPetType(savedDogPetType);
			    ricksPet.setOwner(owner1);
			    ricksPet.setBirthDate(LocalDate.now());
			    ricksPet.setName("Rosco");
			    owner1.getPets().add(ricksPet);
			    
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();	
			owner2.setFirstName("Jessica");
			owner2.setLastName("Fiona");
			owner2.setAddress("346 Brikeral");
			owner2.setCity("346 NJ");
			owner2.setTelephone("345-3467-0808");	
		
			Pet jessicasPet = new Pet();
			jessicasPet.setPetType(savedCatPetType);
			jessicasPet.setOwner(owner2);
			jessicasPet.setBirthDate(LocalDate.now());
			    jessicasPet.setName("Just Cat");
			    owner2.getPets().add(jessicasPet);
					
		ownerService.save(owner2);
		
		Visit catVisit = new Visit();
		catVisit.setPet(jessicasPet);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("Sneezy Kitty");
		
		     visitService.save(catVisit);
		
		
	    Vet vet1 = new Vet();
			vet1.setFirstName("Sam");
			vet1.setLastName("Paul");
			vet1.getSpecialities().add(savedRadiology);
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
			vet2.setFirstName("Paul");
			vet2.setLastName("James");
			vet2.getSpecialities().add(savedSurgery);
			
		vetService.save(vet2);
	}

}
