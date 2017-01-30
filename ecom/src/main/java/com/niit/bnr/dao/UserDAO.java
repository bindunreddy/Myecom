/**
 * 
 */
package com.niit.bnr.dao;

import com.niit.bnr.model.User;

/**
 * @author SARWAN
 *
 */
public interface UserDAO {
	
	public void insertUser(User user);
	public User getUserDetails(String email);
}