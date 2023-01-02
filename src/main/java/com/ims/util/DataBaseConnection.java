package com.ims.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalAssesment", "root",
				"Amulya@4149");
		return connection;
	}

}
