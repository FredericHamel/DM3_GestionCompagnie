package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.Compagnie;

public interface CreateurCompagnie {

	/**
	 * 
	 * @param nom
	 */
	public Compagnie creerCompagnie(String nom);

}