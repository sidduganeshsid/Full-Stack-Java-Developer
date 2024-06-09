package com.sid.TodoWebApp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	//manual authentication.
//	private AuthenticationService authenticationService;
//	
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

//	@RequestMapping(value="/",method = RequestMethod.GET)
//	public String gotoLoginPage(ModelMap model) {
//		model.put("name", "siddu");
//		return "welcome";
//	}
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

//	@RequestMapping(value="login",method = RequestMethod.POST)
//	//login?name=Ranga RequestParam
//	public String gotoWelcomePage(@RequestParam String name, 
//			@RequestParam String password, ModelMap model) {
//		
//		if(authenticationService.authenticate(name, password)) {
//		
//			model.put("name", name);
//			//Authentication 
//			//name 
//			//password 
//			
//			return "welcome";
//		}
//		model.put("errorMessage","Invalid Credentials! Please try again.");
//		return "login";
//	}
}