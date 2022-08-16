package com.globallogic.superadmin.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	@Column
	String pname;
	@Column
	String color;
	@Column
	int price;
	@OneToOne(cascade = CascadeType.PERSIST)
	Category cat;
	@OneToOne(cascade = CascadeType.PERSIST)
	Merchant mer;

	public Product(int pid, String pname, String color, int price, Category cat, Merchant mer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.color = color;
		this.price = price;
		this.cat = cat;
		this.mer = mer;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public Merchant getMer() {
		return mer;
	}

	public void setMer(Merchant mer) {
		this.mer = mer;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", color=" + color + ", price=" + price + ", cat=" + cat
				+ ", mer=" + mer + "]";
	}

}
