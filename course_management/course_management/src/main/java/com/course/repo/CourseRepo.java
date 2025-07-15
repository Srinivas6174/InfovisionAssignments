package com.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.course.model.Course;

@Repository
public interface CourseRepo extends MongoRepository<Course, Long> {

}
