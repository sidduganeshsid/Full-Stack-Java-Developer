package in.webapp.t64WebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller //spring to manage it
@SessionAttributes(value="name")
public class LoginController {
	
	private AuthenticationService authenticationService;

	
public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	//	@RequestMapping("login")
//	public String gotoLogin(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		System.out.println("Request Param is "+name);
//		return "login";
//	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String gotoLogin() {
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, 
			@RequestParam String password, ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
		
			model.put("name", name);
			//Authentication 
			//name - in28minutes
			//password - dummy
			
			return "welcome";
		}
		
		return "login";
}
}
