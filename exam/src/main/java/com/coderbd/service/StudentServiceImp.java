package com.coderbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.dao.StudentDAO;
import com.coderbd.entity.Student;


@Service
@Transactional
public class StudentServiceImp implements StudentServixce{
	@Autowired
	private StudentDAO studentDao;

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public void deleteStudent(Integer id) {
		studentDao.deleteStudent(id);
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(id);
	}

	@Override
	public Student updateStudent(Student student) {
	return studentDao.updateStudent(student);
	}


}
