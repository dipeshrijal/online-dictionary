package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		} else {
			try {
//			Properties prop = new Properties();
//				InputStream inputStream = DbConnection.class.getClassLoader().getResourceAsStream("/db.properties");
//				prop.load(inputStream);
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/entries";
				String user = "root";
				String password = "root";
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}

}
