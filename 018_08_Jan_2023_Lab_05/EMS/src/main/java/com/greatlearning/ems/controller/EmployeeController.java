package com.greatlearning.ems.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String submitButtonClickedForAddEmployee(
		@ModelAttribute("employee")Employee employee) {
		
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}	
	// Add Employee - END
	
	//  Update Employee - Start	
	@GetMapping("/employees/edit/{id}")
	public String updateEmployeeButtonClicked(		
		@PathVariable Long id,
		Model model) {
				
		Employee selectedEmployee = 
			employeeService.getEmployeeById(id);
		
		model.addAttribute("employee", selectedEmployee);
		
		return "edit_employee";
	}
	
	@PostMapping("/employees/{id}")
	public String submitButtonClickedForUpdateEmployee(
		@PathVariable Long id,
		@ModelAttribute("employee")Employee employee) {
		
		//  Update the employee object		
		Employee existingEmployeeObj 
			= employeeService.getEmployeeById(id);
		
		existingEmployeeObj.setFirstName(employee.getFirstName());
		existingEmployeeObj.setLastName(employee.getLastName());
		existingEmployeeObj.setEmail(employee.getEmail());
		
		employeeService.updateEmployee(employee);
		
		return "redirect:/employees";
	}	
	
	// Update Employee - End
	
	@GetMapping ("/employees/{id}")
	public String deleteEmployee(
		@PathVariable Long id	) {
		
		employeeService.deleteById(id);
		return "redirect:/employees";
	}
}
