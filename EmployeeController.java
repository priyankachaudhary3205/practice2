package com.example.db.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.service.EmployeeService;

@RestController
@RequestMapping(path = "testdb")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(path = "/testHello")
	public String helloWorld() {
		return "Hello Chammiya22222";
	}
	
	@GetMapping(path = "/{employeeId}/testHello")
	public String helloWorld(@PathVariable("employeeId") int employeeId) {
		return "Hello "+empService.getEmployee(employeeId);
	}

}
