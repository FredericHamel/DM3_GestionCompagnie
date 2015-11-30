package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.Compagnie;

public class CreateurCompagnieAerienne implements CreateurCompagnie{

	private static CreateurCompagnieAerienne instance;

	private CreateurCompagnieAerienne CreateurCompagnieAerienne() {
		// TODO - implement CreateurCompagnieAerienne.CreateurCompagnieAerienne
		throw new UnsupportedOperationException();
	}

	public static CreateurCompagnieAerienne getInstance() {
		if(instance == null){
			instance = new CreateurCompagnieAerienne();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 */
	public Compagnie creerCompagnie(String nom) {
		// TODO - implement CreateurCompagnieAerienne.creerCompagnie
		throw new UnsupportedOperationException();
	}

}