package com.sample.jpa.db.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedTest {

	private static EntityManager em;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		BankAccountJoined ba1 = new BankAccountJoined(1, "adad", "savings", 2000);
		BankAccountJoined ba2 = new BankAccountJoined(2, "22adad", "current", 3000);
		
		CreditCardJoined cc1 = new CreditCardJoined(3, "cc1", 2020, 12);
		CreditCardJoined cc2 = new CreditCardJoined(4, "cc2", 2019, 11);
	
		
		em.persist(ba1);
		em.persist(ba2);
		em.persist(cc1);
		em.persist(cc2);
		em.getTransaction().commit();
		emf.close();
		
	}

}
