package com.example.demo.events;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event {

	@Id
	private int id;
	private String techFest;
	private String culFest;

	public Event(int id, String techFest, String culFest) {
		super();
		this.id = id;
		this.techFest = techFest;
		this.culFest = culFest;
	}

	public Event() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechFest() {
		return techFest;
	}

	public void setTechFest(String techFest) {
		this.techFest = techFest;
	}

	public String getCulFest() {
		return culFest;
	}

	public void setCulFest(String culFest) {
		this.culFest = culFest;
	}

}
