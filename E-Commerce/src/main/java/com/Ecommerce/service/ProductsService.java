package com.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.Ecommerce.model.Product;

public interface ProductsService {
	
	public Product addproduct(Product product);
	
	public List<Product> getProductlist();
	
	public Optional<Product> getProductById(Integer id);
	
	public void deleteProductById(Integer id);
	
    public Product updateProduct(Product product);
	
	
	
	

}
