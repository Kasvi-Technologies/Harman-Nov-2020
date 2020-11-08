package com.sample.jpa.db.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableTest {

	private static EntityManager em;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		BankAccount ba1 = new BankAccount(1, "adad", "savings", 2000);
		BankAccount ba2 = new BankAccount(2, "22adad", "current", 3000);
		
		CreditCard cc1 = new CreditCard(3, "cc1", 2020, 12);
		CreditCard cc2 = new CreditCard(4, "cc2", 2019, 11);
	
		
		em.persist(ba1);
		em.persist(ba2);
		em.persist(cc1);
		em.persist(cc2);
		em.getTransaction().commit();
		emf.close();
		
	}

}
