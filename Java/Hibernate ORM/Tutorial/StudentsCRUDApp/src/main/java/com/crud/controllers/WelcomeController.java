package com.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public WelcomeController() {
		System.out.println(ANSI_GREEN + "\n\n==Controller Initialized==\n\n" + ANSI_RESET);
	}
	
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "index.jsp";
	}
	
}
