package in.family;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Call(String name,String phno) {};

@Configuration
public class Calling {
	
	@Bean 
	@Primary
	public Call callFather() {
		return new Call("srinivas","9505433999");
	}
	@Bean
	public Call callMother() {
		return new Call("jyothi","9848433999");
	}
	
	@Bean
	@Qualifier("brother")
	public Call callBrother() {
		return new Call("aakash ganesh","7995433999");
	}
	//@Qualifier use in parameter is called.

}
