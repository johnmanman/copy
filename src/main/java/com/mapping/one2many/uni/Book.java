package com.mapping.one2many.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int bid;
private String bname;
private String btype;

public Book() {
	super();
}
public Book(int bid, String bname, String btype) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.btype = btype;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBtype() {
	return btype;
}
public void setBtype(String btype) {
	this.btype = btype;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", btype=" + btype + "]";
} 


}
