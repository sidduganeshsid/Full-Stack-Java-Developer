package in.helloworld;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestHello {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("hello"));
//		System.out.println(context.getBeanDefinitionNames());
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
