package com.niit.bnr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bnr.dao.UserDAO;
import com.niit.bnr.model.Cart;
import com.niit.bnr.model.Product;
import com.niit.bnr.model.User;

@SuppressWarnings("unused")
@Repository("userDAO")
@Transactional
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sessionFactory;
	public void addUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		
		
		
		session.update(user);
		
	}

	public void updateUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
		
	}

	public void deleteUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(user);
		
	}

	public User getUserById(int userId) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.createQuery("from User where userId="+userId);
		return user;
	}

	public List<User> listUsers() {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> users=(List<User>) session.createQuery("from User");
		return users;
	}

	public User getUserByUsername(String username) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.createQuery("from User where username="+username);
		return user;
	}

}

