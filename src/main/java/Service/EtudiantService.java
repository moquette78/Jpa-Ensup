package service;

import dao.EtudiantDao;
import metier.Etudiant;

public class EtudiantService {

private EtudiantDao etudiantDao;
	
	/**
	 * construction
	 */
	public EtudiantService() {
		etudiantDao = new EtudiantDao();
	}

	/**
	 * ajout etudiant
	 * @param etudiant
	 */
	
	//Insere un etudiant dans la base

	public void addEtudiant(Etudiant etudiant) {
		
		etudiantDao.insererEtudiant(etudiant);
		
	}
	
	//Supprime un etudiant dans la base

	public void supprimerEtudiant(Etudiant etudiant) {
			
			etudiantDao.supprimerEtudiant(etudiant);
			etudiant = null;
			
		}
	
	//Modifie un etudiant dans la base

	public void modifierEtudiant(Etudiant etudiant) {
		
		etudiantDao.modifierEtudiant(etudiant);
		
	}
}
