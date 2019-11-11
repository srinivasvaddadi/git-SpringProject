package com.example.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AttendanceController {
	@Autowired
	private AttendanceService attendanceService;

	@RequestMapping("/attendance")
	public List<Attendance> getAllAttendance() {
		return attendanceService.getAllAttendance();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/attendance")
	public void addattendance(@RequestBody Attendance attendance) {
		System.out.printf(attendance.getName(),attendance.getAttendancePercent());
		attendanceService.addAttendance(attendance);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/attendance/{id}")
	public void updateAttendance(@RequestBody Attendance attendance, @PathVariable String id) {
		attendanceService.updateAttendance(id, attendance);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/attendance/{id}")
	public void deleteteAttendancet(@PathVariable String id) {
		attendanceService.deleteAttendance(id);
	}


}
