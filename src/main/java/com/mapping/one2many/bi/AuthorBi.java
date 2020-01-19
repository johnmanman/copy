package com.mapping.one2many.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="author_bi")
public class AuthorBi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String aname;
	private String acity;

	
	@OneToMany(mappedBy="author", cascade = CascadeType.ALL)
//	@JsonIgnore
	List<BookBi> booklist = new ArrayList<BookBi>();

	public AuthorBi() {
		super();
	}

	public AuthorBi(int aid, String aname, String acity, List<BookBi> booklist) {
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

	public List<BookBi> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<BookBi> booklist) {
		this.booklist = booklist;
	}

	@Override
	public String toString() {
		return "AuthorBi [aid=" + aid + ", aname=" + aname + ", acity=" + acity + ", booklist=" + booklist + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acity == null) ? 0 : acity.hashCode());
		result = prime * result + aid;
		result = prime * result + ((aname == null) ? 0 : aname.hashCode());
		result = prime * result + ((booklist == null) ? 0 : booklist.hashCode());
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
		AuthorBi other = (AuthorBi) obj;
		if (acity == null) {
			if (other.acity != null)
				return false;
		} else if (!acity.equals(other.acity))
			return false;
		if (aid != other.aid)
			return false;
		if (aname == null) {
			if (other.aname != null)
				return false;
		} else if (!aname.equals(other.aname))
			return false;
		if (booklist == null) {
			if (other.booklist != null)
				return false;
		} else if (!booklist.equals(other.booklist))
			return false;
		return true;
	}

}
