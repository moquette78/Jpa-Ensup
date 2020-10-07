package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Cours;
import metier.Etudiant;

public class CoursDao {
	
	public void insererCours( Cours cours, Etudiant etudiant) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(etudiant);
		em.persist(cours);
		
		tx.commit();
		
		em.close();
		
	}

}
