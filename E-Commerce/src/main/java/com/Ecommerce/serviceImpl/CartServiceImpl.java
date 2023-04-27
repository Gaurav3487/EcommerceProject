package com.Ecommerce.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.model.Cart;
import com.Ecommerce.repository.CartRepository;
import com.Ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public Cart addToCart(Cart cart) {
         Cart addtocart=cartRepository.save(cart);
		return addtocart;
	}

	@Override
	public Optional<Cart> viewCartProduct(Integer id) {
		Optional<Cart> cartproduct=cartRepository.findById(id);
		return cartproduct;
	}

	@Override
	public void removeFromCart(Integer id) {
	       cartRepository.deleteById(id);
		
	}

	

	@Override
	public Cart updateCartById(Cart cart) {

		return cartRepository.save(cart);
	}

}
