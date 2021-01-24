package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String goHome() {
		return "index";
	}
	
	@GetMapping("/myaccount")
	public String goTomyAccount() {
		return "myAccount";
	}
}
