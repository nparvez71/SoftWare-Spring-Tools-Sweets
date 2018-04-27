package com.example.demo;

public class Employee {
	private int id;
			
	private String name;
	private String salary;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(id+"::"+name);
		
	}
	

}
