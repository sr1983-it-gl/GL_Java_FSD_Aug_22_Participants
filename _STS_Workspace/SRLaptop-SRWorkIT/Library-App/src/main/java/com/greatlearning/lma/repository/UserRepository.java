package com.greatlearning.lma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.lma.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u where u.username = ?1")
	User findUserByUsername(String username);	
}
