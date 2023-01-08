package com.greatlearning.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.entity.Employee;

public interface EmployeeRepository
	extends JpaRepository<Employee, Long>{

}
