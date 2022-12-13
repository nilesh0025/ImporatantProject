package com.yash.ne.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.yash.ne.Model.Userorder;


public interface 	UserorderRepo extends CrudRepository<Userorder,Integer>{
	
}
	
	


