package in.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String hello() {
		return "Hello World!";
//		System.out.println("Hello World!");
	}
}
