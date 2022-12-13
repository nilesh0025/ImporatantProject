package com.yash.ne.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ne.Model.Admin;
import com.yash.ne.Model.Item;
import com.yash.ne.Model.User;
import com.yash.ne.Repo.AdminRepo;
import com.yash.ne.Repo.ItemRepo;

@Service
public class AdminService {
      
	@Autowired
	AdminRepo adrp;
	@Autowired 
	ItemRepo itrp;
	
public Item save(Item item) {
		
		return itrp.save(item);
		
	}

	public Admin fetchUserByEmailIdAndPassword(String tempEmailId, String temppass) {
		
		return adrp.findByEmailIdAndPassword(tempEmailId, temppass);
	}
	

	public Admin fetchAdminByEmailId(String email) {
		
		return adrp.findByEmailId(email);
	}
	public void DeleteUserorder(Integer id) {
		 
		  itrp.deleteById(id);
	
}}
