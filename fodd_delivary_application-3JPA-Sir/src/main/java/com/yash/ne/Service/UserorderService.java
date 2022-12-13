package com.yash.ne.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ne.Model.Item;
import com.yash.ne.Model.Userorder;
import com.yash.ne.Repo.UserorderRepo;

@Service
public class UserorderService {

	@Autowired
	
	UserorderRepo urorp;
	
public Userorder save(Userorder usero) {
		
		return urorp.save(usero);
		
	}

public void DeleteUserorder(Integer id) {
	 
	  urorp.deleteById(id);
}


	


public List<Userorder> getAlluserorderdata() {
	List<Userorder> ilist=(List<Userorder>) urorp.findAll();
	return ilist;
	
}

}
	

