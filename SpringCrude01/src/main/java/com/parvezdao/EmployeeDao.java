package com.parvezdao;

import java.util.List;

import com.parvez.entity.Employee;

public interface EmployeeDao {
	public void add(Employee employee);
	public List<Employee> getAll();
	public void delete(int  id);
	public Employee update(Employee employee);
	public Employee getEmployee(int id);

}
