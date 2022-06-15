package com.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_dec_12_32")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String first;
	private String firstCity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String firstName, String firstCity) {
		this.id = id;
		this.firstName = firstName;
		this.firstCity = firstCity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstCity() {
		return firstCity;
	}

	public void setFirstCity(String firstCity) {
		this.firstCity = firstCity;
	}

	@Override
	public String
	toString() {
		return "Product{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", firstCity='" + firstCity + '\'' +
				'}';
	}
}
