package com.example.demo;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Datasource {
	
	public static DataSource getMysqlDataSource() {
		
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setPortNumber(3306);
		dataSource.setDatabaseName("jdbc");
		dataSource.setUser("root");
		dataSource.setPassword("");
		return dataSource;
		
		
		
		
	}

}
