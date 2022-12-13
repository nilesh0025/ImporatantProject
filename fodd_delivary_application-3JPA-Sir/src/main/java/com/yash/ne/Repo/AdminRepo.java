package com.yash.ne.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.yash.ne.Model.Admin;
import com.yash.ne.Model.Item;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	
	
	public Admin findByEmailIdAndPassword(String emailId, String password);
	
	
	public Admin findByEmailId(String emailId);

	


	
}
