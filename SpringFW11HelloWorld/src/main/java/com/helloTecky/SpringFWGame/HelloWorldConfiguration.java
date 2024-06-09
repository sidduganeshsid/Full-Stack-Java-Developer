package com.helloTecky.SpringFWGame;

//this is java configuration file (for spring context)

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//eliminate verbosity in creating java beans
//public accessor methods, constructor,
//equals, hashcode and toString are automatically created.
//Released in JDK 16

record Person(String name, int age ) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String first() {
		return "HelloWorld";
	}
	@Bean
	public int value() {
		return 15;
	}
	
	@Bean(name="age")
	public int value1() {
		return 15;
	}
	
	@Bean
	public Person person() {
//		Person person = new Person("sid",23);
//		return person;
		return new Person("sham", 25);
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(first(), value());
	}
	@Bean
	public Person person3Parameters(String name,int age) {
		return new Person(name,age);
	}

}
