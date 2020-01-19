package com.mapping.one2one.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductUni {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid; 
	private String pname;
	private float dis;

	public ProductUni() {
		super();
	}

	public ProductUni(int pid, String pname, float dis) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dis = dis;
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

	@Override
	public String toString() {
		return "ProductUni [pid=" + pid + ", pname=" + pname + ", dis=" + dis + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		ProductUni other = (ProductUni) obj;
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
