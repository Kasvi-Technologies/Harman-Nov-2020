package com.sample.jpa.mappings;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OneToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a = new Address("adasd", "ADa");		
		
		User user = new User(a, "A");
		User user1 = new User(a, "B");
		
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(a);
		em.persist(user);
		em.persist(user1);
		
		em.getTransaction().commit();
		
		emf.close();
		
		
		
	}

}
