package com.example.demo.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/departments")
	public void addDept(@RequestBody Department department) {
		System.out.printf(department.getDescription(),department.getFacultyInfo(),department.getFacultyInfo());
		departmentService.addDept(department);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/departments/{id}")
	public void updateDept(@RequestBody Department department, @PathVariable String id) {
		departmentService.updateDepartment(id, department);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/departments/{id}")
	public void deleteteDept(@PathVariable String id) {
		departmentService.deleteDepartment(id);
	}

}
