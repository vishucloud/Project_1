package com.purplewisteria.springboothibernatewebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.springboothibernatewebapp.modal.Course;

public interface CourseRepository  extends CrudRepository<Course, Long> {

}
