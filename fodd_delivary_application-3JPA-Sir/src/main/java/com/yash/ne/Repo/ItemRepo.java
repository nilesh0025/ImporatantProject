package com.yash.ne.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.ne.Model.Item;
import com.yash.ne.Model.User;
import com.yash.ne.Model.Userorder;

public interface ItemRepo extends JpaRepository<Item, Integer> {

	
	
	}
