package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.PersistentObjectException;

import metier.Cours;
import metier.Etudiant;

public class CoursDao {
	
	//Ajoute un cours dans la base

	public void insererCours( Cours cours, Etudiant etudiant) {
		
		try {
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(cours);
		
		
		tx.commit();
		
		em.close();
		
	}catch(PersistentObjectException e) {
		
	}
		
	}

}
