package com.greatlearning.lma.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.lma.entity.User;
import com.greatlearning.lma.repository.UserRepository;

public class LmaUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		User userEntityObj 
			= userRepository.findUserByUsername(username);
				
		LmaUserDetails userDetails = 
			new LmaUserDetails(userEntityObj);		
		return userDetails;
	}

}
