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
	public void addEtudiant(Etudiant etudiant) {
		
		etudiantDao.insererEtudiant(etudiant);
		
	}
	
	public void supprimerEtudiant(Etudiant etudiant) {
			
			etudiantDao.supprimerEtudiant(etudiant);
			etudiant = null;
			
		}
}
