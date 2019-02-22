package com.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.helper.DatabaseManager;
import com.model.Sex;
import com.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		if(DatabaseManager.connection == null){
			System.out.println("Database connection severed..");
			System.out.println("Connecting to database..");
			DatabaseManager.getConnection();
		}
		try {
			Statement stmt = DatabaseManager.connection.createStatement();
			stmt.executeUpdate("INSERT INTO user(email,password,name,surname,birthDate,sex) VALUES ('"+user.geteMail()+ "','" +user.getPassword()+ "','" +user.getName()+ "','" +user.getSurname()+ "','" +user.getBirthDate()+ "','" +user.getSex()+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUser(User user) {
		
		
	}

	@Override
	public boolean isValid(String email) {
		if(DatabaseManager.connection == null){
			System.out.println("Database connection severed..");
			System.out.println("Connecting to database..");
			DatabaseManager.getConnection();
		}
		try {
			if(email == null){
				return false;
			}
			else{
				Statement stmt = DatabaseManager.connection.createStatement();
				ResultSet result = stmt.executeQuery("SELECT email FROM user WHERE email='"+email+"'");
				return !result.next(); //true if email is not in use.
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public User getLoggedInUser(String email, String password) {
		if(DatabaseManager.connection == null){
			System.out.println("Database connection severed..");
			System.out.println("Connecting to database..");
			DatabaseManager.getConnection();
		}
		
		ResultSet result;
		
		try{
			Statement stmt = DatabaseManager.connection.createStatement();
			result = stmt.executeQuery("SELECT * FROM user WHERE email='"+email+"' && password='"+password+"';");
			if(result.next()){
				return new User(result.getString(1),result.getString(2),result.getString(3),result.getString(4),Date.valueOf(result.getString(5)),Sex.valueOf(result.getString(6)));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new User(null,null,null,null,null,null);
		
	}

}
