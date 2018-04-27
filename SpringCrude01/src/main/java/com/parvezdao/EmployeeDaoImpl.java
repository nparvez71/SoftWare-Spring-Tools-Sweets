package com.parvezdao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.parvez.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private SessionFactory SessionFactory;

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
