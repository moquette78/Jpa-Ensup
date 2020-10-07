package Service;

import Dao.EtudiantDao;
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
}
