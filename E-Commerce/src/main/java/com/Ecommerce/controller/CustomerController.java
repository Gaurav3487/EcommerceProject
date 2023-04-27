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

import com.Ecommerce.model.Customer;
import com.Ecommerce.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/registercustomer")
	public ResponseEntity<Customer> RegisterCustomer(@RequestBody Customer customer){
	Customer RegisterCustomer	=customerService.RegisterCustomer(customer);
		return ResponseEntity.ok().body(RegisterCustomer);
	}
	

	
	
	@DeleteMapping("/deletecustomerbyid/{id}")
	public void deleteCustomerById(@PathVariable("id") Integer id) {
		customerService.deleteCustomerById(id);
		
	}
	
	@PutMapping("/updatecustomer/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
	Customer updatecustomer=	customerService.updateCustomerByid(customer);
		return ResponseEntity.ok().body(updatecustomer);
	}
	
	

	
}

