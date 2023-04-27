package com.Ecommerce.controller;

import java.util.List;
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

import com.Ecommerce.model.Orders;
import com.Ecommerce.service.OrderService;
import com.Ecommerce.service.ProductsService;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;


@RestController
@RequestMapping("/order")
public class OrderController {


		@Autowired
	private ProductsService productService;
		
		@Autowired
		private OrderService orderService;
	
	@PostMapping("/placeorder")
	public ResponseEntity<Orders> placeOrder(@RequestBody Orders order){
	Orders orderplace=orderService.placeOrder(order);
		return ResponseEntity.ok().body(orderplace);
		
		
	}
	
	@DeleteMapping("/deleteorder")
    public void deleteOrder(@PathVariable("id") Integer id) {
		orderService.deleteOrder(id);
		
	}
	
	@PutMapping("/updateorder/{id}")
       public ResponseEntity<Orders> updateOrder(@RequestBody Orders order){
		Orders updateorder=orderService.updateOrder(order);
		return ResponseEntity.ok().body(updateorder);
	}
}
