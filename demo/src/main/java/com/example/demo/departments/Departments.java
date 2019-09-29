package com.example.demo.departments;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departments {

	@Id
	private Integer id;
	private String dept;
	private String description;

	public Departments() {

	}

	public Departments(Integer id, String dept, String description) {
		super();
		this.id = id;
		this.dept = dept;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}