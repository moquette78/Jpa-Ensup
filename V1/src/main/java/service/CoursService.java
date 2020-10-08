package service;

import dao.CoursDao;
import dao.EtudiantDao;
import metier.Cours;
import metier.Etudiant;

public class CoursService {

	private CoursDao coursDao;
	
	public CoursService() {
		coursDao = new CoursDao();
	}

	/**
	 * ajout etudiant
	 * @param etudiant
	 */
	
	//Ajoute un cours dans la base
	
	public void addCours(Cours cours, Etudiant etudiant) {
		
		cours.getEtudiants().add(etudiant);
		coursDao.insererCours(cours,etudiant);
		
	}
}
