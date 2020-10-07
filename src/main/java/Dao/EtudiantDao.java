package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Etudiant;

public class EtudiantDao {
	
	public void insererEtudiant( Etudiant etudiant) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(etudiant);
		
		tx.commit();
		
		em.close();
	}

}
