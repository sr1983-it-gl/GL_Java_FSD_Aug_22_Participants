package com.greatlearning.ems.service;

import java.util.List;

import com.greatlearning.ems.entity.Employee;

public interface EmployeeService {

	List<Employee> listEmployees();
	
	Employee saveEmployee(Employee employee);
	
	// Update - Start	
	Employee updateEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);	
	//  Update - End
	
	void deleteById(Long id);
}
