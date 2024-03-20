package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(t -> t.disable());
		http.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/").permitAll();
			auth.anyRequest().authenticated();
		})
		.oauth2Login()
		.defaultSuccessUrl("/welcome",true);
//		.oauth2Login(withDefaults()).
//		formLogin(withDefaults());
		
		// http.oauth2Login(Customizer.withDefaults());
//		http.oauth2Login(oauth -> oauth.loginPage("/login"));
//		http.sessionManagement(t -> t.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return http.build();
	}
	


}