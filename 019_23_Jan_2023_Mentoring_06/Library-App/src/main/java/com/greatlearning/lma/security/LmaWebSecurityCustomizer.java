package com.greatlearning.lma.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class LmaWebSecurityCustomizer extends WebSecurityConfigurerAdapter {

	// Authentication
	protected void configure(AuthenticationManagerBuilder builder) throws Exception {

		builder.authenticationProvider(lmaAuthenticationProvider());
	}

	@Bean
	public DaoAuthenticationProvider lmaAuthenticationProvider() {

		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		// Username / Password
		// Username -> Retrive/Manager the users
		authProvider.setUserDetailsService(userDetailService());

		// Password -> Encrypt the password
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailService() {

		return new LmaUserDetailsService();
	}

	// Authorization

	@Override

	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/", "/books/save", "/books/showFormForAdd", "/books/403")
				.hasAnyAuthority("USER", "ADMIN")
			.antMatchers("/books/showFormForUpdate", "/books/delete")
				.hasAuthority("ADMIN")
			.anyRequest().authenticated()
			.and()
			.formLogin().loginProcessingUrl("/login").successForwardUrl("/books/list").permitAll()
			.and()
			.logout().logoutSuccessUrl("/login").permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/books/403")
			.and()
			.cors().and().csrf().disable();

	}

}
