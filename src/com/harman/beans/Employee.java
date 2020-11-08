package com.harman.beans;

import java.io.Serializable;

//class is a template., 

//Encapsulation example
// wrapping of data and functions together into a single unit 

/**
 * Java Doc generatio
 * @author akanchar
 *
 */

//Bean, POJO, Entity, DTO objects

public class Employee implements Serializable{

	//fields
	
	public static String department ="Engineering";
	
	//data hiding
	private int empId;
	private String empName;
	private String empDesignation;
	private double salary;
	private char gender;
	
	
	//constructor overloading
	
	//default constructor
	//if you have 
	public Employee() {
		System.out.println("Inside employee constructor...");
		//Buisness logic ..
	}
	
	//parameterized constructors...
	public Employee(int empId, String empName, 
						String empDesignation, double salary, char gender) {
		System.out.println("Inside parameterized employee constructor...");
		//Buisness logic ..
		this.empDesignation = empDesignation;
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
		this.gender = gender;
	}
	
	//methods..
	public int getEmpId() {
		return empId;
	}
	
	//current calling instance
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}	
	
	@Override
	public String toString() {
		return this.empId + " " + this.empName + " " + this.getEmpDesignation() 
		+ " " + this.salary + " " + this.gender;
	}
	
	//emp1.equals(emp2)
	@Override
	public boolean equals(Object obj) {
		
		Employee emp = (Employee) obj;
		
		if (this.getEmpId() != emp.getEmpId() || 
				!this.getEmpName().equals(emp.getEmpName()) ||
				!this.getEmpDesignation().equals(emp.getEmpDesignation()) ||
				this.gender != emp.getGender() ||
				this.getSalary()!= emp.getSalary()) {
			
			return false;
			
		}
		
		return true;
		
	}
	
}
