package com.afra.service;

import java.util.List;

import com.afra.entity.Employee;



public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeid);

	public Employee updateEmployee(Employee employee);
}
