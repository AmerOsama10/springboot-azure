package com.example.demo.conroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {


	@GetMapping("/welcome")
	public String welcome(Model model) {
		

		return "welcome"; 
		}


//
//	@GetMapping("/user-info")
//	public String getUserInfo(Model model, Authentication authentication) {
//		OidcUser oidcUser = (OidcUser) authentication.getPrincipal();
//
//		Map<String, Object> claims = oidcUser.getClaims();
//
//		claims.forEach((key, value) -> System.out.println(key + ": " + value));
//		model.addAttribute("claims", claims);
//
//		String username = oidcUser.getName();
//		model.addAttribute("username", username);
//
//		// Return user information as a response (example)
//		return "Welcome";
//	}
}