package com.greatlearning.ems.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		
		List<Employee> employees = employeeService.listEmployees();
			
		model.addAttribute("employees", employees);
		
		return "employees";
	}
	
	// Add Employee - START	
	@GetMapping("/employees/new")
	public String addEmployeeButtonClicked(Model model) {
		
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "create_employee";
	}
	
	@PostMapping("/employees")
	public String submitButtonClicked(
		@ModelAttribute("employee")Employee employee) {
		
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}	
	// Add Employee - END
}
