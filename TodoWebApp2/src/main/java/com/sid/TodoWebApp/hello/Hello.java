package com.sid.TodoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Hello{
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping("/jsp")
	public String helloJsp() {
		return "hello";
	}
}