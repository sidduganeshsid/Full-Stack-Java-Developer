package com.jpahibernate.t63sbjpa.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpahibernate.t63sbjpa.course.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.save(new Course(1,"Java SE","Abdul Bari"));
		repository.save(new Course(2,"Spring Framework & SpringBoot","Ranga Karanam"));
		
//		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Ranga Karanam"));
	}
}


