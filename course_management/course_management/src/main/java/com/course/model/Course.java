package com.course.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

//@Entity
@Document(collection = "course")
public class Course {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
//	@SequenceGenerator(name = "course_seq", sequenceName = "course_seq", allocationSize = 1)
	private Long course_id;
	private String name;
	
	public Course() {
		
	}

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
