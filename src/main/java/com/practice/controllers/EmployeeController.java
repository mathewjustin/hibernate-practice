package com.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entities.Employee;
import com.practice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	 @RequestMapping(value = "employee/search", method = RequestMethod.GET)
	 public List<Employee> search() throws Exception {
		 return empService.findAllEmployees();
	 }
}
