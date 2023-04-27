package com.Ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Serializable>{

	


}
