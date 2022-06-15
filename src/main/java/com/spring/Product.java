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

	public Product(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
