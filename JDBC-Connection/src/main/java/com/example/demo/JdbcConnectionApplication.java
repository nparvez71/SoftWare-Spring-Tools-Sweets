package com.example.demo;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysql.jdbc.Connection;

@SpringBootApplication
public class JdbcConnectionApplication implements ContactDao{
	@Autowired
	private Datasource dataSource;



	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Contact contact) {
		// TODO Auto-generated method stub
		try {
			Connection connection= (Connection)dataSource.getMysqlDataSource().getConnection();
			PreparedStatement pstm=(PreparedStatement) connection.prepareStatement(
					"insert into contact (first_name, last_name, birth_date) values (?, ?, ?)");
			pstm.setString(1, contact.getFirstName());
			pstm.setString(2, contact.getLastName());
			pstm.setDate(3, contact.getBirthDate());
			pstm.execute();
			System.out.println("done");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long contactId) {
		// TODO Auto-generated method stub
		
	}
}
