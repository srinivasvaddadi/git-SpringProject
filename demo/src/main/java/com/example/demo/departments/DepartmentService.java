package com.example.demo.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Departments> getAllDepartments() {
		List<Departments> departments = new ArrayList<>();
		departmentRepository.findAll()
		.forEach(departments::add);
		return departments;
	}

/*	public void getDept(String id) {
		 departmentRepository.findById(id);
	}*/

	public void addDept(Departments department) {
		departmentRepository.save(department);
	}

	public void updateDepartment(String id, Departments department) {
		departmentRepository.save(department);
	}

	public void deleteDepartment(String id) {
		departmentRepository.deleteById(id);
	}

}