package com.purplewisteria.RestfulWebServices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.RestfulWebServices.exception.UserNotFoundException;
import com.purplewisteria.RestfulWebServices.jpa.repository.PostRepository;
import com.purplewisteria.RestfulWebServices.jpa.repository.UserRepository;
import com.purplewisteria.RestfulWebServices.model.Post;
import com.purplewisteria.RestfulWebServices.model.User;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
public class UserJpaResourceController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	// GET  /users
	//retrieveAllUsers
	@GetMapping ("/jpa/users")
	public List<User> retrieveAllUsers() {
		
		return (List<User>) userRepository.findAll();
	}

	
	//GET   /users/{id}
		@GetMapping ("/jpa/users/{id}")
		public Resource<User> retrieveUser (@PathVariable int id) {
			
			   Optional<User> user = userRepository.findById(id);  // returning proper response back...
			   if(!user.isPresent()) {
				   throw new UserNotFoundException("Given id-" + id + " Not Found!");    // Handling Exception...
			   }
			   
		//Implementing HATEOAS - Hypermedia As The Engine Of Application State.	   
			  // Spring Boot 'HATEOAS' Starter enables us to easily add links using the methods. 
			  
			//"all-users", SERVER_PATH + "/users"     
			 // retrieveAllUsers()	
			   
			   Resource <User> resource = new Resource<User> (user.get());
			    
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
		@PostMapping ("/jpa/users")
		public ResponseEntity createUSer(@Valid @RequestBody User user) {  // getting request details into the request body
		
			User savedUser  = userRepository.save(user);
		
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
		@DeleteMapping ("/jpa/users/{id}")
		public void deleteUser (@PathVariable int id) {
			
			   userRepository.deleteById(id);  // returning proper response back...			
		}
		

		  
		@GetMapping ("/jpa/users/{id}/posts")
		public List<Post> retrieveAllUsers(@PathVariable int id) {
			
			 Optional <User > userOptional = userRepository.findById(id);
			     if(!userOptional.isPresent()) {
			    	   throw new UserNotFoundException("id-" + id);    // Handling Exception... 
			     }
			     
			  return   userOptional.get().getPosts();
			 
		}
		
		
		@PostMapping ("/jpa/users/{id}/posts")
		public ResponseEntity createPost(@PathVariable int id, @RequestBody Post post) {  // getting request details into the request body
			
			Optional <User > userOptional = userRepository.findById(id);
		  
			if(!userOptional.isPresent()) {
		    	   throw new UserNotFoundException("id-" + id);    // Handling Exception... 
		     } 
			 User user = userOptional.get();
			
		         post.setUser(user);
		         postRepository.save(post);
		         
		         
			// How to set the URI of the created resource into the response ?
			//  /users/{id}   savedUser.getId()
			URI location = ServletUriComponentsBuilder
	        .fromCurrentRequest()  // current request URI...
	        .path("/{id}")  // appending to URI...
	        .buildAndExpand(post.getId()).toUri();
			
			 //Returning the HTTP Status of 'CREATED' back
		   return ResponseEntity.created(location).build();   //Returning the HTTP Status of 'CREATED' back
		}
		
}
