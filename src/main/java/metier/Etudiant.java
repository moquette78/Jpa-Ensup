package metier;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	
	@ManyToOne (cascade = CascadeType.ALL)
	private Cours cours;
	
	public Etudiant() {
		super();
	}
	
	
	
	public Etudiant(String nom, String prenom, Cours cours) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cours = cours;
	}



	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}



	public int getId() {
		return id;
	}
	
	
	
	
}
