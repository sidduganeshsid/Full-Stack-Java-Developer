//package com.jpahibernate.t63sbjpa.course;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.jpahibernate.t63sbjpa.course.jpa.CourseJpaRepository;
//
//@Component
//public class CourseJpaCommandLineRunner implements CommandLineRunner {
//	
//
//	@Autowired
//	private CourseJpaRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception{
//		repository.insert(new Course(1,"Java SE","Abdul Bari"));
//		repository.insert(new Course(2,"Spring Framework & SpringBoot","Ranga Karanam"));
//		
//		repository.deleteById(2);
//		
//		System.out.println(repository.findById(1));
//	}
//}
