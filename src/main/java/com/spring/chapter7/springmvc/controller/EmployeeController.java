package com.spring.chapter7.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class EmployeeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String welcomeEmployee(ModelMap model){
		model.addAttribute("name","HelloWorld");
		model.addAttribute("greetings", "Welcome to SpringMVC");
		return "hello";
	}
	
}
