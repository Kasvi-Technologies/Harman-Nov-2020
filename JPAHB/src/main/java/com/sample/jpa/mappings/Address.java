package com.sample.jpa.mappings;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", address1=" + address1 + ", address2=" + address2 + "]";
	}
	public Address( String address1, String address2) {
		super();
		//this.id = id;
		this.address1 = address1;
		this.address2 = address2;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	private String address1;
	private String address2;
	
	
}
