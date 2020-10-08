package dao;

import metier.Etudiant;

public interface IEtudiantDao {

	//Insere un etudiant dans la base
	void insererEtudiant(Etudiant etudiant);

	void supprimerEtudiant(Etudiant etudiant);

	void modifierEtudiant(Etudiant etudiant);

	Etudiant selectionnerEtudiant(Etudiant etudiant);

}