package com.example.demo;

import java.util.HashMap;
import java.util.Map;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.bind.annotation.PostMapping;

@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class ,MongoDataAutoConfiguration.class })
@SpringBootApplication(scanBasePackages = {"com"})
@EnableReactiveMongoRepositories("repository package path")
public class DemoApplication extends WebMvcAutoConfiguration  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/departments")
	public Map<String, Object> webhookHandler(Map<String, Object> map) {
		Map<String, Object> departmentService = new HashMap<>();
		departmentService.put("fulfillment text", "CSE , ECE , EEE , CIVIL , MECH");
		return departmentService;

	}
}
