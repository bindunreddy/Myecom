package com.niit.bnr.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bnr.model.Category;

@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	
	@Autowired
	SessionFactory session;
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Category").list();
	}
	
}
