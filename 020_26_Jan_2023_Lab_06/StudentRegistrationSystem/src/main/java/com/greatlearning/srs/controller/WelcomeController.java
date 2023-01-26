package com.greatlearning.srs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

//	@GetMapping
	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}
}
