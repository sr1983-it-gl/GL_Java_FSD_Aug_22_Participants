package com.greatlearning.srs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
