package com.mapping.one2one.bi;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class ProductBi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	private float dis;
	
	@OneToOne(mappedBy="product")
	@JoinColumn(name="cid")
	private CustomerBi customer;
	
	public ProductBi() {
		super();
	}

	public ProductBi(int pid, String pname, float dis, CustomerBi customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dis = dis;
		this.customer = customer;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getDis() {
		return dis;
	}

	public void setDis(float dis) {
		this.dis = dis;
	}

	public CustomerBi getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBi customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "ProductBi [pid=" + pid + ", pname=" + pname + ", dis=" + dis + ", customer=" + customer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + Float.floatToIntBits(dis);
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
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
		ProductBi other = (ProductBi) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (Float.floatToIntBits(dis) != Float.floatToIntBits(other.dis))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	

	
	
}
