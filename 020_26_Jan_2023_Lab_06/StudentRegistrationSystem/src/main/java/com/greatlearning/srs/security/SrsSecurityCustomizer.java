package com.greatlearning.srs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SrsSecurityCustomizer 
	extends WebSecurityConfigurerAdapter{

	public void configure(AuthenticationManagerBuilder auth) 
			throws Exception {
		
		auth.authenticationProvider(srsAuthenticationProvider());
		
	}
	
	@Bean
	public AuthenticationProvider srsAuthenticationProvider() {
	
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		
			// Username
				
		authProvider.setUserDetailsService(userDetailsService());
		
			// Password
		
		authProvider.setPasswordEncoder(getPasswordEncoder());
		
		
		
		return authProvider;
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		return new SrsUserDetailService();
	}
	
	
	// Authorization
	
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	
	}

}


/*

class Employee {}

Employee emp;

process(Employee emp){
	
	emp.setSalary(1000);
	
	
	float sal = 	emp.getSalary();

	emp.salary(1000);
	float sal = emp.salary()

}

*/