package com.ensup.EnsupJpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Service.CoursService;
import metier.Cours;
import metier.Etudiant;
import Service.EtudiantService;


public class DemoJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Etudiant giovanni = new Etudiant("Simon","Giovanni");
		Etudiant braham = new Etudiant("Moussouni","Braham");
		Cours francais = new Cours("Francais");
		
		EtudiantService etudiantService=new EtudiantService();
		CoursService coursService=new CoursService();
		
		etudiantService.addEtudiant(giovanni);
		etudiantService.addEtudiant(braham);
		coursService.addCours(francais, braham);


		
		

	}
	
}