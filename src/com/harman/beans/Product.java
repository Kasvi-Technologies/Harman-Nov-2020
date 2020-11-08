package com.harman.beans;

import java.io.Serializable;

//Single line 

/*
 * Multiple line comments
 */

/**
 * This is product class which is used to store products information..
 * @author akanchar
 *
 */

/**
 * thiadksanda 
 * @author akanchar
 *
 */
public class Product implements Serializable{

	public Product() {
		
	}
	public Product(int productId, String name, String description, double price, String type) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
	}
	private int productId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String name;
	private String description;
	private double price;
	private String type;
	
	public String toString() {
		return "Id:" + productId + " name:" + name + " description:"+ description
				+" price" + price + " type: " + type;
	}
	
	//p1.equals(p2)
	//this refers p1 (current calling instance)
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		//if (obj instanceof Product) return false;
		
		Product p = (Product) obj; //Type Casting  // p2
		
		if (this.productId != p.productId || !this.name.equals(p.getName())
					||!this.getDescription().equals(p.getDescription())
					|| this.price!=p.getPrice()
					|| !this.getType().equals(p.getType())) {
			return false;
		}
		return true;
		
		//boolean flag = (p1 == p2); //memory location
		//System.out.println("products :" + flag);
		
		//boolean flag1 = p1.equals(p2);
		//System.out.println("products :" + flag1);
	}
}
