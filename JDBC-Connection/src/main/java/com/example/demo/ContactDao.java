package com.example.demo;

import java.util.List;



public interface ContactDao {
public List<Contact> findAll();
	
	public void insert(Contact contact);
	
	public void update(Contact contact);
	
	public void delete(Long contactId);
	


}
