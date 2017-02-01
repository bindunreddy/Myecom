package com.niit.bnr.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bnr.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory session;

	@Override
	public void insertUser(User user) {
		session.getCurrentSession().persist(user);

	}

	@Override
	public User getUserDetails(String userid) {

		User user = (User) session.getCurrentSession().get(User.class, userid);
		return user;

	}

}
