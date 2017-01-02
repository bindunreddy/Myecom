
package com.niit.bnr.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.bnr.model.Product;

@Repository("productDAO")
@EnableTransactionManagement
@Transactional
public  class ProductDAOImpl implements ProductDAO {


	@Autowired
	private SessionFactory session;
	
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts(){
		return session.getCurrentSession().createQuery("from Product").list();
	}

	


	}

