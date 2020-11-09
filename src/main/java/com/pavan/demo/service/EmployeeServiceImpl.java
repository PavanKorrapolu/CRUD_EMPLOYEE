package com.pavan.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.demo.model.Employee;
import com.pavan.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployeeByID(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = employeeRepo.findById(id);
		Employee employee = null;
		if(optional.isPresent())
		{
			employee = optional.get();
		}
		else
		{
			throw new RuntimeException("Employee not found for:: "+id);
		}
		return null;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		this.employeeRepo.deleteById(id);
		
	}
	
} 
