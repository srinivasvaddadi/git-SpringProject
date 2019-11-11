package com.example.attendance;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Attendance {

	@Id
	private String id;
	private String name;
	private String roll_no;
	private int attendancePercent;

	public Attendance(String id, String name, String roll_no, int attendancePercent) {
		super();
		this.id = id;
		this.name = name;
		this.roll_no = roll_no;
		this.attendancePercent = attendancePercent;
	}

	public Attendance() {

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

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public int getAttendancePercent() {
		return attendancePercent;
	}

	public void setAttendancePercent(int attendancePercent) {
		this.attendancePercent = attendancePercent;
	}

}
