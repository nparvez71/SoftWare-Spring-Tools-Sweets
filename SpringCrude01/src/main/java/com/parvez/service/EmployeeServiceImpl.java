package com.parvez.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parvez.entity.Employee;
import com.parvezdao.EmployeeDao;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDAO;

	@Transactional
	public void add(Employee employee) {
		employeeDAO.add(employee);
	}

	@Transactional
	public List<Employee> getAll() {
		return employeeDAO.getAll();
	}

	@Transactional
	public void delete(Integer employeeId) {
		employeeDAO.delete(employeeId);
	}

	public Employee getEmployee(int empid) {
		return employeeDAO.getEmployee(empid);
	}

	public Employee update(Employee employee) {
		return employeeDAO.update(employee);
	}

	public void setEmployeeDAO(EmployeeDao employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
