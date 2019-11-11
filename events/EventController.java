package com.example.demo.events;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping("/events")
	public List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/events")
	public void addEvent(@RequestBody Event event) {
		System.out.printf(event.getCulFest(),event.getTechFest());
		//System.out.println(event.getTechFest());
		eventService.addEvent(event);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/events/{id}")
	public void updateDept(@RequestBody Event event, @PathVariable String id) {
		eventService.updateEvent(id, event);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/events/{id}")
	public void deleteteEvent(@PathVariable String id) {
		eventService.deleteEvent(id);
	}

}
