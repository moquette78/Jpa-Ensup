package service;

import metier.Etudiant;

public interface IEtudiantService {

	/**
	 * ajout etudiant
	 * @param etudiant
	 */

	//Insere un etudiant dans la base

	void addEtudiant(Etudiant etudiant);

	void supprimerEtudiant(Etudiant etudiant);

	void modifierEtudiant(Etudiant etudiant);

	Etudiant selectionnerEtudiant(Etudiant etudiant);

}