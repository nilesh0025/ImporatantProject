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

import com.yash.ne.Model.Admin;
import com.yash.ne.Model.Item;
import com.yash.ne.Service.AdminService;
import com.yash.ne.Service.ItemService;
@RestController
@RequestMapping("/adminapi")
public class AdminController {
	
	@Autowired
	AdminService adsr;
	
	@Autowired
	ItemService itsr;
	
	@PostMapping("/adminlogin")
	@CrossOrigin(origins="http://localhost:4200")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		String tempEmailId=admin.getEmailId();
		String temppass=admin.getPassword();
		
		Admin adminobj=null;
		
		if(tempEmailId !=null && temppass !=null) {
			adminobj=adsr.fetchUserByEmailIdAndPassword(tempEmailId,temppass);
		}
		if(adminobj == null) {
			throw new Exception("Bad Credentials");
		}
		
		return adminobj;
		
				
	}
	@PostMapping(value="/registeradmin")
	@CrossOrigin(origins="http://localhost:4200")
	public Item  registeruser(@RequestBody Item item) throws Exception {
		
		Item itemobj=null;
		itemobj=adsr.save(item);
		
		return itemobj;
		
	}
	@GetMapping(value="/getitems")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Item> getAllitemdata(){
		List<Item> ilistdata=itsr.getAllitemdata();
		return ilistdata;



	}
	
	@DeleteMapping("/deleteitemadmin")
	@CrossOrigin(origins="http://localhost:4200")
	public void Deleteuseroder(@RequestParam Integer id) {
		 itsr.DeleteUserorder(id);
	}
}


