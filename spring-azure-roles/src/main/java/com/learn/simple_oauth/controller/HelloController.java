package com.learn.simple_oauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
     @GetMapping("Admin")
     @ResponseBody
     @PreAuthorize("hasAuthority('APPROLE_Admin')")
   
     public String Admin(Authentication auth) {
    	 
         return "Admin message "+auth.getPrincipal();
     }
     
	
}