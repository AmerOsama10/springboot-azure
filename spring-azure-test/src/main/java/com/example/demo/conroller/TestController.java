package com.example.demo.conroller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String showlogin() {
		return "Hello Home";
	}

	@GetMapping("/secured")
	public String secured(Authentication auth) {
		return "Hello secured " + auth.getPrincipal() + "  \n and for name: " + auth.getName();
	}

}
