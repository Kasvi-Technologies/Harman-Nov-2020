package com.sample.jpa.db.beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTest {
	private static EntityManager em;

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
									.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();

		createEmployee("Ravi", "Raj", "Textile", 1000);
		createEmployee("Amit", "Raj", "IT", 500);
		createEmployee("Nitish", "Kumar", "Marketing", 2000);

	}

	private static void createEmployee(String firstName,
			String lastName, String dept, double salary) {
		em.getTransaction().begin();
		Employee emp = new Employee(firstName, lastName, dept, salary);
		em.persist(emp);
		em.getTransaction().commit();
	}
}
