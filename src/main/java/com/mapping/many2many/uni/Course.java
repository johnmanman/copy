package com.mapping.many2many.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	private int cid;
	private String cname;
	
	@ManyToMany (cascade = CascadeType.ALL)
	List<Student> studentList = new ArrayList<>();
	
}
