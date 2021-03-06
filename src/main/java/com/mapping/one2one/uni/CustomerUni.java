package com.mapping.one2one.uni;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerUni {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private float sal;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid")
	private ProductUni product;

	public CustomerUni() {
		super();
	}

	public CustomerUni(int cid, String cname, float sal, ProductUni product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.sal = sal;
		this.product = product;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public ProductUni getProduct() {
		return product;
	}

	public void setProduct(ProductUni product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CustomerUni [cid=" + cid + ", cname=" + cname + ", sal=" + sal + ", product=" + product + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + Float.floatToIntBits(sal);
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
		CustomerUni other = (CustomerUni) obj;
		if (cid != other.cid)
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (Float.floatToIntBits(sal) != Float.floatToIntBits(other.sal))
			return false;
		return true;
	}

	
	
}
