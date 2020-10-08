package com.ensup.EnsupJpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Cours;
import metier.Etudiant;
import service.CoursService;
import service.EtudiantService;
import service.IEtudiantService;


public class DemoJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cours francais = new Cours("Francais");
		
		Etudiant giovanni = new Etudiant("Simon","Giovanni");
		Etudiant braham = new Etudiant("Moussouni","Braham");
		
		IEtudiantService etudiantService=new EtudiantService();
		
		etudiantService.addEtudiant(giovanni);
		etudiantService.addEtudiant(braham);
		etudiantService.supprimerEtudiant(giovanni);
		etudiantService.modifierEtudiant(braham);
		System.out.println(etudiantService.selectionnerEtudiant(braham).toString());
		
		//etudiantService.addEtudiant(braham);
		//coursService.addCours(francais, giovanni);


		
		

	}
	
}
