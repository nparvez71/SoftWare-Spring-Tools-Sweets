package com.example.demo;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;

import another.PlainContact;

public class Test {
	
	
	public static void main(String[] args) {
		ContactDao contactDao=new JdbcConnectionApplication();
		System.out.println(contactDao.getClass().getName());
		Contact contact=new Contact();
		contact.setFirstName("Md. Ruhul");
		contact.setLastName("Amin");
		contact.setBirthDate(new Date((new GregorianCalendar(2001, 10, 1)).getTime().getTime()));
		contactDao.insert(contact);
		
		System.out.println("Name : "+contact.getFirstName());
		System.out.println("Name : "+contact.getLastName());
	}

}
