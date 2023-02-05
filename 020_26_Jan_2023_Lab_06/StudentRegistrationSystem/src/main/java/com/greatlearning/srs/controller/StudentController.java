package com.greatlearning.srs.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
			theStudent = studentService.findById(id);
			
			theStudent.setFirstName(firstName);
			theStudent.setLastName(lastName);
			theStudent.setCourse(course);			
			theStudent.setCountry(country);			
		}
		else
		{
			theStudent = new Student(firstName, lastName, course,country);
		}
		
		// save the Student Record
		studentService.save(theStudent);


		// use a redirect to prevent duplicate submissions
		return "redirect:/students/list";

	}	

	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(
			@RequestParam("studentId") int theId,
			Model theModel) {

		// get the Student  from the service
		Student theStudent = studentService.findById(theId);


		// set Student as a model attribute to pre-populate the form
		theModel.addAttribute("Student", theStudent);

		// send over to our form
		return "Student-form";			
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int theId) {
		// delete the Student Record

		studentService.deleteById(theId);

		// redirect to /student/list

		return "redirect:/students/list";
	}	
	
	
	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {

			model.addObject("msg", "Hi " + user.getName()
			+ ", you do not have permission to access this page!");

		} else {

			model.addObject("msg",
			"You do not have permission to access this page!");
		}

		model.setViewName("403");

		return model;
	}	
	
}
