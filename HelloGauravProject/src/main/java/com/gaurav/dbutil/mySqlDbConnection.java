package com.gaurav.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySqlDbConnection {

	private static Connection con;

	private mySqlDbConnection() {
		super();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("\n driver loaded successfully");
		String url = "jdbc:mysql://localhost:3306/player";
		String username = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, username, password);
		//con.close();
		return con;
	}

}
