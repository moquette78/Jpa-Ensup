package metier;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String theme;
	
	@OneToMany(mappedBy = "cours")
	private Collection<Etudiant> etudiants ;
	
	public Cours() {
		
	}
	
	public Cours(String theme) {
		super();
		this.theme = theme;
		this.etudiants = new HashSet<Etudiant>();

	}
	
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}


	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
