package com.purplewisteria.RestfulWebServices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.RestfulWebServices.exception.UserNotFoundException;
import com.purplewisteria.RestfulWebServices.model.User;
import com.purplewisteria.RestfulWebServices.service.UserDaoService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService  userDaoService;
	
	// GET  /users
	//retrieveAllUsers
	@GetMapping ("/users")
	public List<User> retrieveAllUsers() {
		
		return userDaoService.findAll();
	}
	
	
	//GET   /users/{id}
	@GetMapping ("/users/{id}")
	public Resource<User> retrieveUser (@PathVariable int id) {
		   User user = userDaoService.findUser(id);  // returning proper response back...
		   if(user==null) {
			   throw new UserNotFoundException("User id not found " + id);    // Handling Exception...
		   }
		   
	//Implementing HATEOAS - Hypermedia As The Engine Of Application State.	   
		  // Spring Boot 'HATEOAS' Starter enables us to easily add links using the methods. 
		  
		//"all-users", SERVER_PATH + "/users"     
		 // retrieveAllUsers()
		   
		   Resource <User> resource = new Resource<User> (user);
		    
		   // Adding links to the resource...get the link to the 'retrieveAllUsers()' - creating links from methods..
		   ControllerLinkBuilder linkTo =
				   
				   ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
		  
		   resource.add(linkTo.withRel("all-users")); // Adding links to the resource.
		   
		   // Returning 'User" (Data) & the link to "all-users"
		return resource;
	}

	
	
	/* Input details of the USer
	 Body of the 'POST' request will be mapped to the method parameter..here..
	 */
	@PostMapping ("/users")
	public ResponseEntity createUSer(@Valid @RequestBody User user) {  // getting request details into the request body
	
		User savedUser  = userDaoService.save(user);
	
		 
		// How to set the URI of the created resource into the response ?
		//  /users/{id}   savedUser.getId()
		URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()  // current request URI...
        .path("/{id}")  // appending to URI...
        .buildAndExpand(savedUser.getId()).toUri();
		
		 //Returning the HTTP Status of 'CREATED' back
	   return ResponseEntity.created(location).build();   //Returning the HTTP Status of 'CREATED' back
	}
	
	@PutMapping ("/users")
	public ResponseEntity updateUSer(@Valid @RequestBody User user) {  // getting request details into the request body
	
		User savedUser  = userDaoService.save(user);
	
		 
		// How to set the URI of the created resource into the response ?
		//  /users/{id}   savedUser.getId()
		URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()  // current request URI...
        .path("/{id}")  // appending to URI...
        .buildAndExpand(savedUser.getId()).toUri();
		
		 //Returning the HTTP Status of 'CREATED' back
	   return ResponseEntity.created(location).build();   //Returning the HTTP Status of 'CREATED' back
	}
	//DELETE  /users/{id}
	@DeleteMapping ("/users/{id}")
	public void deleteUser (@PathVariable int id) {
		
		   User user = userDaoService.deleteById(id);  // returning proper response back...
		   
		   if(user==null) {
			   throw new UserNotFoundException("User id not found-" + id);    // Handling Exception...
		   }
		
	}
	
}
