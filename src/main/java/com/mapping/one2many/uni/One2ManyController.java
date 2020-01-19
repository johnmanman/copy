package com.mapping.one2many.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onetomanyuni")
public class One2ManyController {
	
	@Autowired 
	One2ManyUniRepo repo;
	
	@PostMapping("/postA")
	public void postA(@RequestBody Author a){
		Author author = a;
		System.out.println(author);
	}

	
}
