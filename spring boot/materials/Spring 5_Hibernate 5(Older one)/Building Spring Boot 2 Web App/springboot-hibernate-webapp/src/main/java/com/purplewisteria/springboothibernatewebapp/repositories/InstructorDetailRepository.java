package com.purplewisteria.springboothibernatewebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.springboothibernatewebapp.modal.InstructorDetail;

public interface InstructorDetailRepository  extends CrudRepository<InstructorDetail, Long> {

}
