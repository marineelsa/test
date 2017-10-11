package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Clients;

public class Exec {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		
		Clients p = new Clients("Zita", "Eva");
		
		em.persist(p);
		
		tx.commit();
	}

}
