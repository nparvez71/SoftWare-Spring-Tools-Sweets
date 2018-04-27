package com.coderbd;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity // This tells Hibernate to make a table out of this class
@Table(name ="user" ,uniqueConstraints= 
@UniqueConstraint(columnNames= {"email","role_id"}))
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;
    
@ManyToOne
@JoinColumn(name="role_id")
	private Role role;

public User() {
	super();
}

public User(String name, String email, Role role) {
	super();
	this.name = name;
	this.email = email;
	this.role = role;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", role=" + role + "]";
}




}