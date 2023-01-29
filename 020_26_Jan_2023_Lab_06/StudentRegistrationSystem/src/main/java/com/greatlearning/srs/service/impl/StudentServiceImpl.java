package com.greatlearning.srs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.srs.entity.Student;
import com.greatlearning.srs.repository.StudentRepository;
import com.greatlearning.srs.service.StudentService;

@Service
public class StudentServiceImpl
	implements StudentService{

	@Autowired
	StudentRepository repository;
	
	@Override
	public List<Student> listAll() {
		
		return repository.findAll();
	}

	@Override
	public void add(Student student) {
				
		repository.save(student);
	}

}
