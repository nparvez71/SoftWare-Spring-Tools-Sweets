package com.parvez.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.parvez.entity.Employee;
import com.parvez.service.EmployeeService;


@Controller
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAll();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}

}
