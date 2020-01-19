package com.mapping.one2many.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="author")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int aid;
 private String aname;
 private String acity;
 
 @OneToMany (cascade=CascadeType.ALL)
 @JoinColumn(name="aid")
 List<Book> booklist = new ArrayList<Book>();

public Author() {
	super();
}

public Author(int aid, String aname, String acity, List<Book> booklist) {
	super();
	this.aid = aid;
	this.aname = aname;
	this.acity = acity;
	this.booklist = booklist;
}

public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getAname() {
	return aname;
}

public void setAname(String aname) {
	this.aname = aname;
}

public String getAcity() {
	return acity;
}

public void setAcity(String acity) {
	this.acity = acity;
}

public List<Book> getBooklist() {
	return booklist;
}

public void setBooklist(List<Book> booklist) {
	this.booklist = booklist;
}

@Override
public String toString() {
	return "Author [aid=" + aid + ", aname=" + aname + ", acity=" + acity + ", booklist=" + booklist + "]";
}
 
 
}
