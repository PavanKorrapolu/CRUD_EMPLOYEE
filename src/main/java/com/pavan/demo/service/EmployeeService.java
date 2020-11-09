package com.pavan.demo.service;

import java.util.List;

import com.pavan.demo.model.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployeeByID(long id);
	void deleteEmployeeById(long id);
}
