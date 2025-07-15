package com.course.service;

import java.util.Optional;

import com.course.model.Course;

public interface UpdateNameById {
	
	public Optional<Course> updateById(long id,String updatedName);

}
