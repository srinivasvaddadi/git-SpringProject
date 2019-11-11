package com.example.demo.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<>();
		departmentRepository.findAll();
		return departments;
	}

	public void addDept(Department department) {
		departmentRepository.save(department);
	}

	public void updateDepartment(String id, Department department) {
		departmentRepository.save(department);
	}

	public void deleteDepartment(String id) {
		departmentRepository.deleteById(id);
	}

}
