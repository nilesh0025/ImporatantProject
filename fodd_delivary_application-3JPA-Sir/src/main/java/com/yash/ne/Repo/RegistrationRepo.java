package com.yash.ne.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yash.ne.Model.User;

public interface RegistrationRepo extends JpaRepository<User, Integer> {

	

	

	
	public User findByEmailId(String emailId);
	
	

	



	public User findByEmailIdAndPassword(String emailId, String password);
}
