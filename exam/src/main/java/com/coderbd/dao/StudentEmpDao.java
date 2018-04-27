package com.coderbd.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.coderbd.entity.Student;



public class StudentEmpDao implements StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		return sessionFactory.getCurrentSession().createQuery("from Student")
				.list();
	}

	@Override
	public void deleteStudent(Integer id) {
		Student student = (Student) sessionFactory.getCurrentSession().load(
				Student.class, id);
		if (null != student) {
			this.sessionFactory.getCurrentSession().delete(student);
		}
		
	}

	@Override
	public Student getStudent(int id) {
		return (Student) sessionFactory.getCurrentSession().get(
				Student.class, id);
		}

	@Override
	public Student updateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
		return student;
	}

}
