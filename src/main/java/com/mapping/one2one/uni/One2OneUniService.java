package com.mapping.one2one.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class One2OneUniService {
	@Autowired 
	One2OneUniRepository repo;

	public CustomerUni saveBody(CustomerUni custom) {
		CustomerUni cust = this.repo.save(custom);
		return cust;
	}
	
}
