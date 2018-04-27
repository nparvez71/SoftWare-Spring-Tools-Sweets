package com.coderbd;

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
		jdbc.execute("insert into employee(name,salary) values('lipoo',35000)");
		return "data inserted donnne";
	}


/*
@RequestMapping("/update")
public String update() {
String sql="update employee set name='bbc' where id=1";
jdbc.execute(sql);
return "update success fully";
}

@RequestMapping("/delete")
public String delete() {
	jdbc.execute("delete from employee where id=3");
	
	return "deleted ";
	
	
}*/



}
