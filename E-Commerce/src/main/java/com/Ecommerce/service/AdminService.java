package com.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.Ecommerce.model.Admin;

public interface AdminService {
	
	public Admin saveAdmin(Admin admin);

	public List<Admin> getAdminList();
	
	public Optional<Admin> getAdmin(Integer id);
	
	public Admin updateAdmin(Admin admin);

	
	
	




	

}
