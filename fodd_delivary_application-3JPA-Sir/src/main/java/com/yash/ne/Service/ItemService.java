package com.yash.ne.Service;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.yash.ne.Model.Item;
import com.yash.ne.Model.User;
import com.yash.ne.Model.Userorder;
import com.yash.ne.Repo.ItemRepo;

@Service
public class ItemService{
    @Autowired
    ItemRepo itrp;
    
      
	public List<Item> getAllitemdata(){
		List<Item> ilist=itrp.findAll();
		return ilist;
	
	}
	public void DeleteUserorder(Integer id) {
		 
		  itrp.deleteById(id);
	}
}


