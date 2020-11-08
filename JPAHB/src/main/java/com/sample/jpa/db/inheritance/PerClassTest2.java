package com.sample.jpa.db.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PerClassTest2 {

	private static EntityManager em;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		BankAccountPerClass ba1 = new BankAccountPerClass(1, "adad", "savings", 2000);
		BankAccountPerClass ba2 = new BankAccountPerClass(2, "22adad", "current", 3000);
		
		CreditCardPerClass cc1 = new CreditCardPerClass(3, "cc1", 2020, 12);
		CreditCardPerClass cc2 = new CreditCardPerClass(4, "cc2", 2019, 11);
	
		
		em.persist(ba1);
		em.persist(ba2);
		em.persist(cc1);
		em.persist(cc2);
		em.getTransaction().commit();
		emf.close();
		
	}

}
