package com.purplewisteria.PetClinic.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.purplewisteria.PetClinic.model.Owner;
import com.purplewisteria.PetClinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
			
	private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "owners/createOrUpdateOwnerForm";

	private final OwnerService ownerService;
	
		public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	   @GetMapping("/{ownerId}")
		    public ModelAndView showOwner(@PathVariable("ownerId") Long ownerId) {
		        ModelAndView mav = new ModelAndView("owners/ownerDetails");
		        mav.addObject(ownerService.findById(ownerId));
		        return mav;
		    }
		   
		   @RequestMapping("/find")
		    public String findOwners(Model model){
		        model.addAttribute("owner", new Owner());
		        return "owners/findOwners";
		    }
		   
		   @GetMapping 
		//   @RequestMapping(method = RequestMethod.GET)
		    public String processFindForm(Owner owner, BindingResult result, Model model){
		        // allow parameterless GET request for /owners to return all records
		        if (owner.getLastName() == null) {
		            owner.setLastName(""); // empty string signifies broadest possible search
		        }

		        // find owners by last name
		        List<Owner> results = ownerService.findAllByLastNameLike("%"+ owner.getLastName() + "%");

		        if (results.isEmpty()) {
		            // no owners found
		            result.rejectValue("lastName", "notFound", "not found");
		            return "owners/findOwners";
		        } else if (results.size() == 1) {
		            // 1 owner found
		            owner = results.get(0);
		            return "redirect:/owners/" + owner.getId();
		        } else {
		            // multiple owners found
		            model.addAttribute("selections", results);
		            return "owners/ownersList";
		        }
		    }
		   

		    @GetMapping("/new")
		    public String initCreationForm(Model model) {
		        model.addAttribute("owner", new Owner());
		        return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
		    }

		    @PostMapping("/new")
		    public String processCreationForm(@Valid Owner owner, BindingResult result) {
		        if (result.hasErrors()) {
		            return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
		        } else {
		            Owner savedOwner =  ownerService.save(owner);
		            return "redirect:/owners/" + savedOwner.getId();
		        }
		    }

		    
		    @GetMapping("/{ownerId}/edit")
		    public String initUpdateOwnerForm(@PathVariable Long ownerId, Model model) {
		        model.addAttribute("owner", ownerService.findById(ownerId));
		        return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
		    }

		    @PostMapping("/{ownerId}/edit")
		    public String processUpdateOwnerForm(@Valid Owner owner, BindingResult result, @PathVariable Long ownerId) {
		        if (result.hasErrors()) {
		            return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
		        } else {
		            owner.setId(ownerId);
		            Owner savedOwner = ownerService.save(owner);
		            return "redirect:/owners/" + savedOwner.getId();
		        }
		    }
		    
	}