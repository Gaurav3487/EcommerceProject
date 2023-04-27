package com.Ecommerce.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.model.Admin;
import com.Ecommerce.repository.AdminRepository;
import com.Ecommerce.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin saveAdmin(Admin admin) {
		Admin welcomeadmin=adminRepository.save(admin);
		return welcomeadmin;
	}

	@Override
	public List<Admin> getAdminList() {
	List<Admin> adminslist= adminRepository.findAll();
		return adminslist;
	}

	@Override
	public Optional<Admin> getAdmin(Integer id) {
		Optional<Admin> admin=adminRepository.findById(id);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {

		return adminRepository.save(admin);
	}

	
	

}
