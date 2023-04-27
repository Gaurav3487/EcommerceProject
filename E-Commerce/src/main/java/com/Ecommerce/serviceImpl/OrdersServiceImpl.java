package com.Ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.model.Orders;
import com.Ecommerce.repository.OrderRepository;
import com.Ecommerce.service.OrderService;

@Service
public class OrdersServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	
	
	@Override
	public Orders placeOrder(Orders order) {
	Orders orderplace=orderRepository.save(order);
		return orderplace;
	}

	@Override
	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);
	 
		
	}

	@Override
	public List<Orders> Orderlist() {
	List<Orders> orderlist= orderRepository.findAll();
		return orderlist;
	}

	@Override
	public Optional<Orders> getOrderById(Integer id) {
		Optional<Orders> orderfromid=orderRepository.findById(id);
		return orderfromid;
	}

	@Override
	public Orders updateOrder(Orders order) {
		
		return orderRepository.save(order);
	}

}
