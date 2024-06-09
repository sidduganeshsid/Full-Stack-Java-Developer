package in.webapp.t64WebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller				//web ui then use controller .// it looks back for view page
public class sayHelloController {
	
	//"say-hello" => "Hello! what are you learning today"
	@RequestMapping("say-hello") //spring MVC provides it
	@ResponseBody //return as is.
	public String sayHello() {
		return "Hello! What are you learning today";
	}
	
	@RequestMapping("say-hello-html") //spring MVC provides it
	@ResponseBody //return as is.
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<HTML>");
		sb.append("<head>");
		sb.append("<title>using spring boot</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>HTML response from SPRING BOOT</h1>");
		sb.append("</body>");
		sb.append("</HTML>");
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp") //spring MVC provides it
	public String sayHelloJsp() {
		return "sayHello";
	}
	
	
	

}
