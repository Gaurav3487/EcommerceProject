package com.Ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.model.Product;
import com.Ecommerce.repository.ProductRepository;
import com.Ecommerce.service.ProductsService;

@Service
public class ProductServiceImpl implements ProductsService {

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Product addproduct(Product product) {
	Product addedproduct=productRepository.save(product);
		return addedproduct;
	}


	@Override
	public List<Product> getProductlist() {
		List<Product> productlist= productRepository.findAll();
		return productlist;
	}


	@Override
	public Optional<Product> getProductById(Integer id) {
		Optional<Product> productname= productRepository.findById(id);
		return productname;
	}


	@Override
	public void deleteProductById(Integer id) {
	  productRepository.deleteById(id);
		
	}


	@Override
	public Product updateProduct(Product product) {
		
		return productRepository.save(product);
	}


	
	

	
}
