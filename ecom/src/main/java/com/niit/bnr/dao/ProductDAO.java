package com.niit.bnr.dao;

import java.util.List;

import com.niit.bnr.model.Product;

public interface ProductDAO {

	public List<Product> getAllProducts();
	public void insert(Product p);
	public Product getProduct(String id);
	public void deleteProduct(String id);
	void updateProduct(Product product);
	
}