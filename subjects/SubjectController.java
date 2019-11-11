package com.example.subjects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/subject")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/subject")
	public void addattendance(@RequestBody Subject subject) {
		System.out.printf(subject.getFaculty());
		subjectService.addSubject(subject);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/subject/{id}")
	public void updateAttendance(@RequestBody Subject subject, @PathVariable String id) {
		subjectService.updateSubjects(id, subject);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/subject/{id}")
	public void deleteteSubject(@PathVariable String id) {
		subjectService.deleteSubjects(id);
	}


}
