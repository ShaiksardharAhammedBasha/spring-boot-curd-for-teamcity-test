package com.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_June_06_15")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String firstname;
	private String firstcity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String firstname, String firstcity) {
		this.id = id;
		this.firstname = firstname;
		this.firstcity = firstcity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstcity() {
		return firstcity;
	}

	public void setFirstcity(String firstcity) {
		this.firstcity = firstcity;
	}
}
