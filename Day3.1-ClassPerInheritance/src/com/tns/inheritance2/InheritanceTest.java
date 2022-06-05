package com.tns.inheritance2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager en=factory.createEntityManager();
		en.getTransaction().begin();
		
		Employee emp=new Employee();
		emp.setName("Akshay");
		emp.setSalary(35000);
		en.persist(emp);
		
		Employee emp1=new Employee();
		emp.setName("Amol");
		emp.setSalary(45000);
		en.persist(emp1);
		
		Manager mg=new Manager();
		mg.setName("Ankita");
		mg.setSalary(55000);
		mg.setDepName("Information technology");
		en.persist(mg);
		
		en.getTransaction().commit();
		System.out.println("Added Employee");
		en.close();
		factory.close();
		
	}

}
