package com.yash.ne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ne.Model.Item;
import com.yash.ne.Model.Ramdanspecial;
import com.yash.ne.Service.RamdanspecialService;

@RestController
@RequestMapping("/ramdan")
public class RamdanspecialController {
	@Autowired
	RamdanspecialService rsps;
	
	
	@GetMapping(value="/getramdanspecial")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Ramdanspecial> getAllitemdata(){
		List<Ramdanspecial> ilistdata=rsps.getAllramdandata();
		return ilistdata;

}}
