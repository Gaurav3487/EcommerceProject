package com.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.Ecommerce.model.Customer;

public interface CustomerService {
	
	public Customer RegisterCustomer(Customer customer);
	
	public List<Customer> getCustomerlist();
	
	public Optional<Customer> getCustomerById(Integer id);
	
	public void deleteCustomerById(Integer id);
	
	public Customer updateCustomerByid(Customer customer);
	
	

	

}
