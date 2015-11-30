package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.Compagnie;

public class CreateurCompagnieCroisiere {

	private static CreateurCompagnieCroisiere instance;

	private CreateurCompagnieCroisiere CreateurCompagnieCroisiere() {
		// TODO - implement CreateurCompagnieCroisiere.CreateurCompagnieCroisiere
		throw new UnsupportedOperationException();
	}

	public static CreateurCompagnieCroisiere getInstance() {
		if(instance == null){
			instance = new CreateurCompagnieCroisiere();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 */
	public Compagnie creerCompagnie(String nom) {
		// TODO - implement CreateurCompagnieCroisiere.creerCompagnie
		throw new UnsupportedOperationException();
	}

}