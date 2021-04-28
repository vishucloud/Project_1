package com.purplewisteria.RestfulWebServices.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.purplewisteria.RestfulWebServices.model.Post;

@Repository
public interface PostRepository extends CrudRepository <Post, Integer>{
	
}
