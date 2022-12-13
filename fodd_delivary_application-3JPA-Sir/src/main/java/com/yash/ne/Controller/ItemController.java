package com.yash.ne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ne.Model.Item;
import com.yash.ne.Model.User;
import com.yash.ne.Model.Userorder;
import com.yash.ne.Service.ItemService;

@RestController
@RequestMapping("/itemapi")

public class ItemController {
  
	@Autowired
	ItemService itsr;
	@GetMapping(value="/getitem")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Item> getAllitemdata(){
		List<Item> ilistdata=itsr.getAllitemdata();
		return ilistdata;
	}
	
	
		
	}


