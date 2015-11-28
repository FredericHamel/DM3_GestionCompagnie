package Domaine.Systeme.Fabrique;

public abstract interface CreateurLieu {

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	Lieu creerLieu(String nom, String ville);

}