package com.parvez.service;

import java.util.List;

import com.parvez.entity.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public List<Employee> getAll();
	public void delete(int  id);
	public Employee update(Employee employee);
	public Employee getEmployee(int id);

}
