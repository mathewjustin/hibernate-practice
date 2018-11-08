package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.practice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	 @RequestMapping(value = "employee/search", method = RequestMethod.GET)
	 public ModelAndView search() throws Exception {
		 ModelAndView mov=new ModelAndView();
		 mov.setViewName("employee-search");
		 mov.addObject("emp-list", empService.findAllEmployees());
		 return mov;
	 }
}
