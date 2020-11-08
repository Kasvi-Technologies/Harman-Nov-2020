package com.sample.jpa.mappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", address=" + address + ", name=" + name + "]";
	}
	public User(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@OneToOne
	@ManyToOne
	private Address address;
	
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
	private String name;
	
}
