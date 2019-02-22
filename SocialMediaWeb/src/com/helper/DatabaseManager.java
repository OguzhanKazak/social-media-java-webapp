package com.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	
	public static Connection connection;
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	private static String dbUrl = "jdbc:mysql://localhost:3306/socialmediadb?characterEncoding=UTF-8";
	
	private static String name = "kazak";
	
	private static String password = "*******";

	public static Connection getConnection(){	
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(dbUrl,name,password);
			return connection;
		}catch (SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
 	
}
