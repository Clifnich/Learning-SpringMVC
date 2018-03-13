package com.puzhen.in28minutes.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puzhen.in28minutes.ValidationService;

@Controller
public class LogoutController {

	@Autowired
	ValidationService service;
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String showLoginPage(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		// terminate authentication
		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}
}
