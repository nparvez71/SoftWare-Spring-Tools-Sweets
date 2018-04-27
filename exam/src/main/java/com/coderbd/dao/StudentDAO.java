package com.coderbd.dao;

import java.util.List;

import com.coderbd.entity.Student;


public interface StudentDAO {

	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer id);

	public Student getStudent(int id);
	
	public Student updateStudent(Student student);

	

	
}