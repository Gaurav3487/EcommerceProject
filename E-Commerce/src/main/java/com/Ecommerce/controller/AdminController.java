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

import com.Ecommerce.model.Admin;
import com.Ecommerce.model.Customer;
import com.Ecommerce.model.Orders;
import com.Ecommerce.model.Product;
import com.Ecommerce.service.AdminService;
import com.Ecommerce.service.CustomerService;
import com.Ecommerce.service.OrderService;
import com.Ecommerce.service.ProductsService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private ProductsService productService;
	
	@PostMapping("/saveadmin")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin){
           Admin saveadmin= adminService.saveAdmin(admin);
		return ResponseEntity.ok().body(saveadmin);
	}
	
	@GetMapping("/getadminlist")
	public ResponseEntity<List<Admin>> getAdminList(){
		List<Admin>   adminlist=adminService.getAdminList();
		return ResponseEntity.ok().body(adminlist);
	}
	

	@PostMapping("/products/addproduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product addproduct=productService.addproduct(product);
		return ResponseEntity.ok().body(addproduct);
	}
	
	
	
	
	@DeleteMapping("/products/deleteproduct/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProductById(id);
	}
	
	@GetMapping("/products/getproductlist")
	public ResponseEntity<List<Product>> getProductList(){
List<Product>	productlist	=productService.getProductlist();

		return ResponseEntity.ok().body(productlist);
	}
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@GetMapping("/customers/getcustomerlist")
	public ResponseEntity<List<Customer>> getCustomerList(){
	   List<Customer> customerlist=customerService.getCustomerlist();
		return ResponseEntity.ok().body(customerlist);
	}

	@GetMapping("/customers/getcustomerbyid/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable("id") Integer id){
	Optional<Customer>	cusmr=customerService.getCustomerById(id);
		return ResponseEntity.ok().body(cusmr);
	}
	
	@DeleteMapping("/customers/deletecustomerbyid/{id}")
	public void deleteCustomerById(@PathVariable("id") Integer id) {
		customerService.deleteCustomerById(id);
		
	}
	@GetMapping("/order/getorder/{id}")
	public ResponseEntity<Optional<Orders>> getOrderById(@PathVariable("id") Integer id){
		Optional<Orders> orderbyid=orderService.getOrderById(id);
		return ResponseEntity.ok().body(orderbyid);
	}
	@GetMapping("/order/getorderlist")
	public ResponseEntity<List<Orders>> getorderlist(){
		List<Orders> listoforders=orderService.Orderlist();
		return ResponseEntity.ok().body(listoforders);
	}
	
	@GetMapping("/getadmin/{id}")
	public ResponseEntity<Optional<Admin>> getAdmin(@PathVariable("id") Integer id){
		Optional<Admin> adminbyid=adminService.getAdmin(id);
		return ResponseEntity.ok().body(adminbyid);
	}

	@PutMapping("/updateadmin/{id}")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin){
	Admin updateadmin	=adminService.updateAdmin(admin);
		return ResponseEntity.ok().body(updateadmin);
	}
}
