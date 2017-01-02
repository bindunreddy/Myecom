package com.niit.bnr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bnr.model.Cart;
import com.niit.bnr.dao.CartDAO;

@Repository
@Transactional
@EnableTransactionManagement
public class CartDAOImpl implements CartDAO{

	
	@Autowired
	SessionFactory sessionFactory;
	
	public void addCart(Cart cart) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(cart);
		
	}

	public void updateCart(Cart cart) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(cart);
		
	}

	public Cart getCartById(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.createQuery("from Cart where cartId="+cartId);
		return cart;	
	}

}
