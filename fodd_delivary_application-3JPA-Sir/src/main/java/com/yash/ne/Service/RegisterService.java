package com.yash.ne.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ne.Model.User;
import com.yash.ne.Repo.RegistrationRepo;

@Service
public class RegisterService {

	@Autowired
	RegistrationRepo rrpo;
	
	public User save(User user) {
		
		return rrpo.save(user);
		
	}

	public User fetchUserByEmailId(String email) {
		
		return rrpo.findByEmailId(email);
	}

	public User fetchUserByEmailIdAndPassword(String email, String password) {
		
		return rrpo.findByEmailIdAndPassword(email, password);
	}
	
}
