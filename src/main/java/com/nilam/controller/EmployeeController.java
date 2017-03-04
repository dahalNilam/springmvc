package com.nilam.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nilam.domain.Employee;
import com.nilam.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Hello");
		return "welcome";
	}
	
	@RequestMapping("/{name}")
	public String add(Map<String, Object> model) {
		Employee employee = new Employee();
		employee.setName("nilam");
		System.out.println(employee.getName());
//		employeeService.save(employee);
		return "home";
	}

}
