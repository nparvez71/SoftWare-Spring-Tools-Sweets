package com.example.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/parvez/beans.xml");
		EmployeeDAO empdao=(EmployeeDAO) context.getBean("employeeDao");
List<Employee> employee=empdao.getEmployees();

for (Employee emp:employee) {
	
	System.out.println(emp);
}
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
