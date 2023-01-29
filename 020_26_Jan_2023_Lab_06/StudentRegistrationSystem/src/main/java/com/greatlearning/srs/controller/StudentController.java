package com.greatlearning.srs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.srs.entity.Student;
import com.greatlearning.srs.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/list")
	public String listStudents(Model model) {
		
		// students - model
		List<Student> students = studentService.listAll();
		
		System.out.println("Students->" + students);
		
		model.addAttribute("Students", students);
		
		// view 
		return "list-students";
	}
	
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Student theStudent = new Student();

		theModel.addAttribute("Student", theStudent);

		return "Student-form";
	}
	
	
	@PostMapping("/save")
	public String saveStudent(
		@RequestParam("id") int id,
		@RequestParam("firstName") String firstName,
		@RequestParam("lastName") String lastName,
		@RequestParam("course") String course,
		@RequestParam("country") String country) {

		System.out.println(id);
		Student theStudent = null;
		
		if(id!=0)
		{
		}
		else
		{
			theStudent = new Student(firstName, lastName, course,country);
		}
		
		// save the Student Record
		studentService.add(theStudent);


		// use a redirect to prevent duplicate submissions
		return "redirect:/students/list";

	}	
	
}
