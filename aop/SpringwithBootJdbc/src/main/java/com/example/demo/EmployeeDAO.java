package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("employeeDao")
public class EmployeeDAO {
	private JdbcTemplate jdbc;

	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);

	}

	public List<Employee> getEmployees() {
		return jdbc.query("select * from employee ", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp =new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getString("salary"));
				return emp;
			}

		});

	}

}
