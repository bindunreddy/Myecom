package com.niit.bnr.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.bnr.model.Product;

@Repository("productDAO")

@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory session;

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		return session.getCurrentSession().createQuery("from Product").list();
	}

	@Override
	@Transactional
	public void insert(Product p) {
		session.getCurrentSession().persist(p);
	}

	@Override
	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return (Product) session.getCurrentSession().get(Product.class, id);
	}

	@Override
	public void deleteProduct(String id) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getProduct(id));

	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(product);
	}

}
