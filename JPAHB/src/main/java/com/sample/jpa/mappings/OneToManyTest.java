package com.sample.jpa.mappings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OneToManyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cart cart = new Cart();

        Items item1 = new Items(cart);
        Items item2 = new Items(cart);
        
        Set<Items> itemsSet = new HashSet<Items>();
        itemsSet.add(item1);
        itemsSet.add(item2);

        cart.setItems(itemsSet);
        
		
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(cart);
		em.persist(item1);
		em.persist(item2);
		
		em.getTransaction().commit();
		
		emf.close();
		
		System.out.println("Cart ID=" + cart.getId());
        System.out.println("item1 ID=" + item1.getId() + ", Foreign Key Cart ID=" + item1.getCart().getId());
        System.out.println("item2 ID=" + item2.getId() + ", Foreign Key Cart ID=" + item1.getCart().getId());
		
	}

}
