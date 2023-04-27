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

import com.Ecommerce.model.Product;
import com.Ecommerce.service.ProductsService;


@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductsService productService;
	
	@PostMapping("/addproduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product addproduct=productService.addproduct(product);
		return ResponseEntity.ok().body(addproduct);
	}
	
	
	@GetMapping("/getproduct/{id}")
	public ResponseEntity<Optional<Product>> getProductdetails(@PathVariable("id") Integer id){
		Optional<Product> product=productService.getProductById(id);
		return ResponseEntity.ok().body(product);
	}
	
	
	
	@DeleteMapping("/deleteproduct/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProductById(id);
	}
	
	@GetMapping("/getproductslist")
	public ResponseEntity<List<Product>> getProductList(){
		List<Product> productlist=productService.getProductlist();
		return ResponseEntity.ok().body(productlist);
	}
	
	@PutMapping("/updateproduct/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		Product updateproduct=productService.updateProduct(product);
		return ResponseEntity.ok().body(updateproduct);
	}
}
