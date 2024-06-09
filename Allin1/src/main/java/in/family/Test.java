package in.family;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Calling.class);
		
		System.out.println(context.getBean(Call.class));
		System.out.println(context.getBean("callBrother"));
	}

}
