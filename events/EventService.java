package com.example.demo.events;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	public List<Event> getAllEvents() {
		List<Event> events = new ArrayList<>();
		eventRepository.findAll()
		.forEach(events::add);
		return events;
	}

	public void addEvent(Event event) {
		eventRepository.save(event);
	}

	public void updateEvent(String id, Event event) {
		eventRepository.save(event);
	}

	public void deleteEvent(String id) {
		eventRepository.deleteById(id);
	}

}
