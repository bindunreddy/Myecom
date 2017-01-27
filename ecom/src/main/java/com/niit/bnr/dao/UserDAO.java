package com.niit.bnr.dao;

import com.niit.bnr.model.User;

public interface UserDAO {
	
	public void insertUser(User user);
	public User getUserDetails(String userId);
	
	

}

