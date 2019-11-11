package com.example.subjects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> getAllSubjects() {
		List<Subject> attendance = new ArrayList<>();
		subjectRepository.findAll();
		return attendance;
	}

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public void updateSubjects(String id, Subject subject) {
		subjectRepository.save(subject);
	}

	public void deleteSubjects(String id) {
		subjectRepository.deleteById(id);
	}

}
