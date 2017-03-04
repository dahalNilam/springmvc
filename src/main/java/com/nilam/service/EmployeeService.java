package com.nilam.service;

import java.util.List;

import com.nilam.domain.Employee;

public interface EmployeeService {

	public void save(Employee employee);
	public Employee getEmployeeById(long id);
	public List<Employee> getEmployeeList();
	public void update(Employee employee);
	public void delete(Employee employee);
	public void delete(long id);

}
