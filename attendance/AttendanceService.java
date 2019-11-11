package com.example.attendance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
	@Autowired
	private AttendanceRepository attendanceRepository;

	public List<Attendance> getAllAttendance() {
		List<Attendance> attendance = new ArrayList<>();
		attendanceRepository.findAll();
		return attendance;
	}

	public void addAttendance(Attendance attendance) {
		attendanceRepository.save(attendance);
	}

	public void updateAttendance(String id, Attendance attendance) {
		attendanceRepository.save(attendance);
	}

	public void deleteAttendance(String id) {
		attendanceRepository.deleteById(id);
	}

}
