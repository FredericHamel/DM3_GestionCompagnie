package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.Lieu;

public abstract interface CreateurLieu {

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	public Lieu creerLieu(String nom, String ville);

}
