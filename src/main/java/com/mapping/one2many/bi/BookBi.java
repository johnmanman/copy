package com.mapping.one2many.bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table()
public class BookBi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bname;
	private String btype;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "aid")
	AuthorBi author = new AuthorBi();

public BookBi() {
	super();
}

public BookBi(int bid, String bname, String btype, AuthorBi author) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.btype = btype;
	this.author = author;
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

public AuthorBi getAuthor() {
	return author;
}

public void setAuthor(AuthorBi author) {
	this.author = author;
}

@Override
public String toString() {
	return "BookBi [bid=" + bid + ", bname=" + bname + ", btype=" + btype + ", author=" + author + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + bid;
	result = prime * result + ((bname == null) ? 0 : bname.hashCode());
	result = prime * result + ((btype == null) ? 0 : btype.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BookBi other = (BookBi) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (bid != other.bid)
		return false;
	if (bname == null) {
		if (other.bname != null)
			return false;
	} else if (!bname.equals(other.bname))
		return false;
	if (btype == null) {
		if (other.btype != null)
			return false;
	} else if (!btype.equals(other.btype))
		return false;
	return true;
}


}