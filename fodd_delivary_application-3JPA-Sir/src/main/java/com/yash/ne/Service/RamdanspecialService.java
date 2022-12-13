package com.yash.ne.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yash.ne.Model.Ramdanspecial;
import com.yash.ne.Repo.RamdanspecialRepo;
@Service
public class RamdanspecialService {
   @Autowired
   RamdanspecialRepo rmrp;
	public List<Ramdanspecial> getAllramdandata() {
	     
		
			List<Ramdanspecial> ilist=rmrp.findAll();
			return ilist;
		
	}

}
