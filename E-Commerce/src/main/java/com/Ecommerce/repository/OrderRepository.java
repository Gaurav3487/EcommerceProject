package com.Ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Serializable>{

}
