package com.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.model.Course;
import com.course.service.CourseServices;
import com.course.service.UpdateNameById;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	 @Autowired
	    private CourseServices service;
	 
	 @Autowired
	 private UpdateNameById updateNameById;
	
	 @GetMapping("/get")
	    public ResponseEntity<List<Course>> getAllCourses() {
	        List<Course> courses = service.findAll();
	        return ResponseEntity.ok(courses);
	    }
	
	@GetMapping("{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Long id){
		Optional<Course> course=service.findById(id);
		if(course.isPresent()) {
			return ResponseEntity.ok(course.get());
		}else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
	
	
	 @PutMapping("/update/{id}")
	   public ResponseEntity<Course> updateName(@PathVariable Long id, @RequestBody Course courseDetails){
		   String updatedname=courseDetails.getName();
		   Optional<Course> updateName=updateNameById.updateById(id,updatedname);
		   
		   if (updateName.isPresent()) {
		        return ResponseEntity.ok(updateName.get());
		    } else {
		        return ResponseEntity.notFound().build();
		    }
	   	
	   }
	   @PostMapping("/add")
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        Course saved = service.save(course);
        return ResponseEntity.ok(saved);
    }
	   
	  
		
	}

//	@DeleteMapping("/delete/{id}")




