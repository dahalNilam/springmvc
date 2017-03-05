package com.nilam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nilam.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		// return new ModelAndView("view page", "argument name", value);
		return new ModelAndView("employee", "allEmployees", employeeService.getAllEmployees());
	}

}
