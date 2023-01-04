package com.pms.unit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static  Connection getConnection()  throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading class
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaTraining", "root", "Amulya@4149"); 
	  return connection;
	}

}
