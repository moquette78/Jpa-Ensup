package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.PersistentObjectException;

import metier.Etudiant;

public class EtudiantDao implements IEtudiantDao {
	
	//Insere un etudiant dans la base
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
	
	//Supprime un etudiant dans la base

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
		
		//Modifie un etudiant dans la base

		public void modifierEtudiant( Etudiant etudiant) {
			
			try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
			EntityManager em = emf.createEntityManager();
			
			EntityTransaction tx = em.getTransaction();
			
			
			Etudiant etudiantUpdate  = em.find(Etudiant.class, etudiant.getId());
			etudiantUpdate.setNom("Toto");
			
			  //em.find(Etudiant.class, etudiant.getId());
			  
			  tx.begin();
			  
			    em.merge(etudiantUpdate);
			  
			  tx.commit();
			  
			
			em.close();
			
	}catch(PersistentObjectException e) {
			
		}
	
		}
		
public Etudiant selectionnerEtudiant( Etudiant etudiant) {
			
	Etudiant etudiantSelect = new Etudiant();
	
			try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensupJpa");
			EntityManager em = emf.createEntityManager();
			
			 etudiantSelect = em.find(Etudiant.class, etudiant.getId());
			
			  
			
			em.close();
			
	}catch(PersistentObjectException e) {
			
		}
			return etudiantSelect;
		}

}
