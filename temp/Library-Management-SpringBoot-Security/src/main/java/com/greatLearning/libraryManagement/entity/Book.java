package com.greatLearning.libraryManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="book")
@Getter
@Setter
public class Book {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="category")
	private String category;
	
	
	@Column(name="author")
	private String author;

	public Book()
	{
		
	}

	public Book(String name, String category, String author) {
		super();
		this.name = name;
		this.category = category;
		this.author = author;
	}
	
	
}











