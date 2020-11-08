package com.sample.jpa.db.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeJPATest {

	private static EntityManager em;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
		
		//Fetch Employees..
		Query q = em.createQuery("select e from Employee e");
        List<Employee> empList = q.getResultList();
        for (Employee emp : empList) {
            System.out.println(emp);
        }
        System.out.println("Size: " + empList.size());
        
        
        Query q1 = em
                .createQuery("SELECT e FROM Employee e WHERE e.id >:id");
        q1.setParameter("id", 1);
        
        List<Employee> empList1 = q1.getResultList();
        
        System.out.println("employees with id more than 1");
        for (Employee emp : empList1) {
        	System.out.println(emp);
        }
        
        
        q1  = em.createQuery("SELECT max(e.salary) FROM Employee e");
        System.out.println(q1.getSingleResult());
        
        //like , order by in query
        q1 = em.createNamedQuery("find employee by id");
        q1.setParameter("id", 1);
        
        Employee emp =   (Employee) q1.getSingleResult();
        System.out.println(emp);
        

	}

}
