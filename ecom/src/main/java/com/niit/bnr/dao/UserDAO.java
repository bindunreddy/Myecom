package com.niit.bnr.dao;

import java.util.List;

import com.niit.bnr.model.User;

public interface UserDAO {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUserById(int userId);
	public List<User> listUsers();
	

}

