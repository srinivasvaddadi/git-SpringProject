package com.example.subjects;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Subject {

	@Id
	private String id;
	private String name;
	private String faculty;

	public Subject(String id, String name, String faculty) {
		super();
		this.id = id;
		this.name = name;
		this.faculty = faculty;
	}

	public Subject() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

}
