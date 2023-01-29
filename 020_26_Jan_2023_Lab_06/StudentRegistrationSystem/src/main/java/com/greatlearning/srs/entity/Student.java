package com.greatlearning.srs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.protocol.a.NativeConstants.IntegerDataType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@Data

public class Student {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FIRST_NAME")	
	private String firstName;

	@Column(name = "LAST_NAME")		
	private String lastName;
	
	@Column(name = "COURSE")		
	private String course;
	
	@Column(name = "COUNTRY")		
	private String country;
	
	public Student() {
		
	}
	
	public Student(String fname, String lname, String course, String country) {
		
		this.firstName = fname;
		this.lastName = lname;
		this.course = course;
		this.country = country;
				
	}
}
