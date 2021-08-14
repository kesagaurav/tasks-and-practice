package com.gaurav.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDbConnection {

	private static Connection con;

	public MysqlDbConnection() {
		super();
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/player";
		String username = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
}
