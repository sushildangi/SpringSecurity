package com.isolutons4u.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String showLoginPage() {

		// return "plain-login";
		return "fancy-login";
	}

	@GetMapping("/access-denied")
	public String accessDenied() {

		return "access-denied";
	}

}
