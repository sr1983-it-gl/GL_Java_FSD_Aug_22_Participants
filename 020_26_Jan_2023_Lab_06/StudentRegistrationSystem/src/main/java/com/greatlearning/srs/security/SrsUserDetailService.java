package com.greatlearning.srs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.srs.controller.UserRepository;
import com.greatlearning.srs.security.entity.User;

@Service
public class SrsUserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		User entityObj =  userRepository.getUserByUsername(username);
		
		SrsUserDetails userDetails = new SrsUserDetails(entityObj);
		// TODO Auto-generated method stub
		return userDetails;
	}
}
