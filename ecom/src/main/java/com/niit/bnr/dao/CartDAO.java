package com.niit.bnr.dao;

import com.niit.bnr.model.Cart;

public interface CartDAO {
	
	public void addCart(Cart cart);
	public void updateCart(Cart cart);
	public Cart getCartById(int cartId);

}
