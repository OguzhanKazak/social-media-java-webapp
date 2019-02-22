package com.dao;

import com.model.User;

public interface UserDao {

	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public boolean isValid(String email);
	
	public User getLoggedInUser(String email, String password);
}
