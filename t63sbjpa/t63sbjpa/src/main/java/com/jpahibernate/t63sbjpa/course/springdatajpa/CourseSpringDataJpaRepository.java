package com.jpahibernate.t63sbjpa.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpahibernate.t63sbjpa.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	//custome method defining . Attribute first letter has to be capital
	List<Course> findByAuthor(String author);

}
