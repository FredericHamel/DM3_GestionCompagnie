package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.Lieu;

public class CreateurAeroport implements CreateurLieu {

	private static CreateurAeroport instance = null;

	private CreateurAeroport CreateurAeroport() {
		// TODO - implement CreateurAeroport.CreateurAeroport
		throw new UnsupportedOperationException();
	}

	public static CreateurAeroport getInstance() {
		if(instance == null){
			instance = new CreateurAeroport();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	public Lieu creerLieu(String nom, String ville) {
		// TODO - implement CreateurAeroport.creerLieu
		throw new UnsupportedOperationException();
	}

}