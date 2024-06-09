package in.webapp.t64WebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("user");
		boolean isValidPassword = password.equalsIgnoreCase("user123");
		
		return isValidUserName && isValidPassword;
	}}


