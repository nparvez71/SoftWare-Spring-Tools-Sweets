package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column(name="id")
	
	private Long id;
	@Column(name="name")
	@NotEmpty(message ="please enter your name")
	private String name;
	@Column(name="email" ,unique=true)
	@Email(message ="please enter valid email")
	@NotEmpty(message ="please enter your email")
	private String email;
	@Column(name="mobile")
	@Length(min=11, message ="please enter your mobile 11chr" )
	@NotEmpty(message ="please enter your mobile")
	private String mobile;
	public Employee() {
		super();
	}
	public Employee(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	

}
