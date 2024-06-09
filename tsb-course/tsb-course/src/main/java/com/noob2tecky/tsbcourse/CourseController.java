package com.noob2tecky.tsbcourse;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController{
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Abdul Bari","Java SE"),
				new Course(2,"Ranga Karanam", "Spring Framework and Spring Boot"),
				new Course(3,"Ranga Karanam", "Microservices and Cloud"),
				new Course(4,"Pulkit", "DSA with JAVA")
				);
	}
	
}