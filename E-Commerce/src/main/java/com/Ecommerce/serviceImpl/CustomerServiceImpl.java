package com.Ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.model.Customer;
import com.Ecommerce.repository.CustomerRepository;
import com.Ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer RegisterCustomer(Customer customer) {
	     Customer registercustomer=customerRepository.save(customer);
		return registercustomer;
	}

	@Override
	public List<Customer> getCustomerlist() {
		List<Customer> customerlist= customerRepository.findAll();
		return customerlist;
	}

	@Override
	public Optional<Customer> getCustomerById(Integer id) {
	Optional<Customer> cusmr	=customerRepository.findById(id);
		return cusmr;
	}

	@Override
	public void deleteCustomerById(Integer id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer updateCustomerByid(Customer customer) {
	return	customerRepository.save(customer);
	}

	

	

	
}
