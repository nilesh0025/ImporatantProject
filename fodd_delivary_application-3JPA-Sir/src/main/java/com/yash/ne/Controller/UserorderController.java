package com.yash.ne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.yash.ne.Model.Userorder;
import com.yash.ne.Service.UserorderService;

@RestController
@RequestMapping("/orderapi")
public class UserorderController {

	@Autowired
	UserorderService ursp;
	
	
	@PostMapping(value="/adduserorder")
	@CrossOrigin(origins="http://localhost:4200")
	public Userorder  AddUserorder(@RequestBody Userorder usero) throws Exception {
		
		
		Userorder userobj=null;
		userobj=ursp.save(usero);
		
		return userobj;
}
	
	@DeleteMapping("/deleteuserorder")
	@CrossOrigin(origins="http://localhost:4200")
	public void Deleteuseroder(@RequestParam Integer id) {
		 ursp.DeleteUserorder(id);
		
	}
	@GetMapping("/getalluserorder")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Userorder> getAllitemdata(){
		List<Userorder> ilistdata=ursp.getAlluserorderdata();
		return ilistdata;
		
	}
		
		
	}
	





