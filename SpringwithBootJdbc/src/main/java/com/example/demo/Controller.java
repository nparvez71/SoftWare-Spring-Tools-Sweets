package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String insert() {
		jdbc.execute("insert into employee(name,salary) values('parvez',15000)");
		return "data inserted donnne";
	}

}
