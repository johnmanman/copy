package com.mapping.many2many.uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id 
	private int id;
	private String name;
	private float score;
	
}
