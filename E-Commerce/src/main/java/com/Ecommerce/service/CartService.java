package com.Ecommerce.service;

import java.util.Optional;

import com.Ecommerce.model.Cart;

public interface CartService {

	public Cart addToCart(Cart cart);
	
	public Optional<Cart> viewCartProduct(Integer id);
	
	public void removeFromCart(Integer id);
	
	public Cart updateCartById(Cart cart);
}
