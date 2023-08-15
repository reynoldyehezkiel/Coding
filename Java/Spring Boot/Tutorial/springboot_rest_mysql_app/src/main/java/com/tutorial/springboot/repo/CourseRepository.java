package com.tutorial.springboot.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.springboot.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
