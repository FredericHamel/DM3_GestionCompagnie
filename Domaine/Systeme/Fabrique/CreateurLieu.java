package Domaine.Systeme.Fabrique;

public abstract interface CreateurLieu {

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	public Lieu creerLieu(String nom, String ville);

}