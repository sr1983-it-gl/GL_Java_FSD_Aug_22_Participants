package com.greatlearning.srs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


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


@Configuration
public class SrsSecurityCustomizer 
	extends WebSecurityConfigurerAdapter{

	// Authentication
	
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




	public void configure(HttpSecurity http) throws Exception {

		/*
		ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry
		obj1 = 
		http.authorizeRequests();
		
		obj1.antMatchers("");
		*/
		
		// ANT  Matchers
		// /a/b/c*
		// /a/b/**/*
		//
		
       http.authorizeRequests()
       .antMatchers("/","/students/save","/students/showFormForAdd","/students/403")
       		.hasAnyAuthority("USER","ADMIN")
       .antMatchers("/students/showFormForUpdate","/students/delete")
       		.hasAuthority("ADMIN")
       .anyRequest().authenticated()
       .and()
       .formLogin().loginProcessingUrl("/login").successForwardUrl("/students/list").permitAll()
       .and()
       .logout().logoutSuccessUrl("/login").permitAll()
       .and()
       .exceptionHandling().accessDeniedPage("/students/403")
       .and()
       .cors().and().csrf().disable();		
	}
}


