package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.PersistentObjectException;

import metier.Etudiant;

public class EtudiantDao {
	
	public void insererEtudiant( Etudiant etudiant) {
		
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(etudiant);
		
		tx.commit();
		
		em.close();
		
}catch(PersistentObjectException e) {
		
	}

	}
	
		public void supprimerEtudiant( Etudiant etudiant) {
				
				try {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
				EntityManager em = emf.createEntityManager();
				
				EntityTransaction tx = em.getTransaction();
				
				Etudiant etudiantRemove = em.find(Etudiant.class, etudiant.getId());

				  tx.begin();
				  
				  em.remove(etudiantRemove);
				  
				  tx.commit();
				
				em.close();
				
		}catch(PersistentObjectException e) {
				
			}
		
			}

}
