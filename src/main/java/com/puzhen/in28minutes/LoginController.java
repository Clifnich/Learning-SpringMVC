package com.puzhen.in28minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	ValidationService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validate(@RequestParam String name,
			@RequestParam String password, ModelMap model) {
		if (service.validate(name, password)) {
			model.put("name", name);
			return "welcome";
		} else {
			model.put("errorMessage", "there is an error");
			return "login";
		}
	}
}
