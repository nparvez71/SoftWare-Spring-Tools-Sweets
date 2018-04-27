package com.urmi.file;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

	private Map<String, Contact> contacts = new HashMap<String, Contact>();

	public Map<String, Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		
		StringBuilder sBuilder = new StringBuilder();
		
		for(Map.Entry<String, Contact> contact : contacts.entrySet()) {
			
			sBuilder.append((contact) + "\n");
			
		}
		
		return sBuilder.toString();
		
	}
	
	

}
