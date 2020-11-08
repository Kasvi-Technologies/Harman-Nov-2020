package com.sample.jpa.db.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_DB")
@NamedQuery(query = "Select e from Employee e where e.id = :id", name = "find employee by id")
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;

	@Column(name = "fistName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "dept")
	private String dept;
	
	@Column(name = "salary")
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public Employee( String firstName, String lastName, String dept, double salary) {
		//this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDept(dept);
		this.salary = salary;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return id + " " + getFirstName() + " " + getDept() + " " + getLastName();
	}
}
