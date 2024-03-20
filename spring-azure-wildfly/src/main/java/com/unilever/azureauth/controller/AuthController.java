package com.unilever.azureauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

		@GetMapping("/welcome")
		public String welcome() {
			
			return "welcome"; 
			
			}

}