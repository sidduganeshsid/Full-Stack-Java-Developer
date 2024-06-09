package in.sid.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService{
	//JPA/Hibernate > db
	//UserDaoService > static list
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Siddu",LocalDate.now()));
	}
	
}