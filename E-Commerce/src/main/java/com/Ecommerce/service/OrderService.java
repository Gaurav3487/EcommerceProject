package com.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.Ecommerce.model.Orders;

public interface OrderService {

	public Orders placeOrder(Orders order);
	
	public void deleteOrder(Integer id);
	
	public List<Orders> Orderlist();
	
	public Optional<Orders> getOrderById(Integer id); 
	
	public Orders updateOrder(Orders order);
}
