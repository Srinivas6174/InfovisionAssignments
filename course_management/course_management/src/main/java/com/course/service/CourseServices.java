
package com.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.controller.CourseController;
import com.course.model.Course;
import com.course.repo.CourseRepo;


@Service
public class CourseServices implements UpdateNameById{
	
    @Autowired
    private CourseRepo repository;
    
  

    public Course save(Course course) {
        return repository.save(course);
    }

  

	public List<Course> findAll() {
		return repository.findAll();
	}



	public Optional<Course> findById(long id) {
		return repository.findById(id);
	}


	@Override
	public Optional<Course> updateById(long id, String updatedName) {
	    Optional<Course> optionalCourse = repository.findById(id);

	    if (optionalCourse.isPresent() && updatedName != null && !updatedName.trim().isEmpty()) {
	        Course course = optionalCourse.get();
	        course.setName(updatedName); 
	        Course savedCourse = repository.save(course); 
	        return Optional.of(savedCourse);
	    }

	    return Optional.empty();
	}

	

}
