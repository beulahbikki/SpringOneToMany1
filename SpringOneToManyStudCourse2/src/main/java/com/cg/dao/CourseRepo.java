package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
