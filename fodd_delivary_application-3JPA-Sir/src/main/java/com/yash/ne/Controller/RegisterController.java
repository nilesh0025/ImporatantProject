package com.yash.ne.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ne.Model.User;
import com.yash.ne.Service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	RegisterService rspo;
	@PostMapping(value="/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public User  registeruser(@RequestBody User user) throws Exception {
		
		String tempemailId=user.getEmailId();
		if(tempemailId !=null && !"".equals(tempemailId)){
			User userobj=rspo.fetchUserByEmailId(tempemailId);
				if(userobj !=null) {	
					throw new Exception("user with"+tempemailId+"already exist");
				}
		}
		User userobj=null;
		userobj=rspo.save(user);
		
		return userobj;
		
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		String temppass=user.getPassword();
		
		User userobj=null;
		
		if(tempEmailId !=null && temppass !=null) {
			userobj=rspo.fetchUserByEmailIdAndPassword(tempEmailId,temppass);
		}
		if(userobj == null) {
			throw new Exception("Bad Credentials");
		}
		
		return userobj;
		
				
	}
}
	
	
	
	

