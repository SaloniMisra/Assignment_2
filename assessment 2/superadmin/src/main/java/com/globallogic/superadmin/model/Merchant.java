package com.globallogic.superadmin.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="merchant")
public class Merchant {
	@Column
	String mname;
	@Column
	int pincode;
	@Column
	String location;
	@Column
	int gstno;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int mid;
	public Merchant(String mname, int pincode, String location, int gstno, int mid) {
		super();
		this.mname = mname;
		this.pincode = pincode;
		this.location = location;
		this.gstno = gstno;
		this.mid = mid;
	}
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getGstno() {
		return gstno;
	}
	public void setGstno(int gstno) {
		this.gstno = gstno;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Merchant [mname=" + mname + ", pincode=" + pincode + ", location=" + location + ", gstno=" + gstno
				+ ", mid=" + mid + "]";
	}
	
}
	

