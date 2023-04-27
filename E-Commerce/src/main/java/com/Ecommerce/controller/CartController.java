package com.Ecommerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.model.Cart;

import com.Ecommerce.service.CartService;




@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/addtocart")
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart){
		Cart addcart=cartService.addToCart(cart);
		
		return ResponseEntity.ok().body(addcart);
	}

	@DeleteMapping("/removefromcart/{id}")
	public void deleteCartProduct(@PathVariable("id") Integer id) {
		cartService.removeFromCart(id);
	}
	
	@GetMapping("/viewcart/{id}")
	public ResponseEntity<Optional<Cart>> viewProduct(@PathVariable("id") Integer id){
        Optional<Cart> cart= cartService.viewCartProduct(id);
		return ResponseEntity.ok().body(cart);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Cart> updateEmployeeById(@RequestBody Cart cart) {
		Cart updatecart=cartService.updateCartById(cart);
		return ResponseEntity.ok().body(updatecart);
		
	}
}
