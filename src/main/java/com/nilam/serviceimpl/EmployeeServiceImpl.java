package com.nilam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilam.domain.Employee;
import com.nilam.repository.EmployeeRepository;
import com.nilam.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
