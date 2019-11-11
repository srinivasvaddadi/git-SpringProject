package com.example.demo.departments;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {

	@Id
	private Integer id;
	private String dept;
	private String description;
	private String facultyInfo;
	private String HODInfo;

	public Department() {

	}

	public Department(Integer id, String dept, String description, String FacultyInfo, String HODInfo) {
		super();
		this.id = id;
		this.dept = dept;
		this.description = description;
		this.facultyInfo = facultyInfo;
		this.HODInfo = HODInfo;
	}

	public String getFacultyInfo() {
		return facultyInfo;
	}

	public void setFacultyInfo(String facultyInfo) {
		this.facultyInfo = facultyInfo;
	}

	public String getHODInfo() {
		return HODInfo;
	}

	public void setHODInfo(String hODInfo) {
		HODInfo = hODInfo;
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
