package Domaine.Systeme.Fabrique;

import Domaine.Transport.Place.*;

public class CreateurSiegeAvion implements CreateurPlace {

	private static CreateurSiegeAvion instance;

	private CreateurSiegeAvion CreateurSiegeAvion() {
		// TODO - implement CreateurSiegeAvion.CreateurSiegeAvion
		throw new UnsupportedOperationException();
	}

	public static CreateurSiegeAvion getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param s
	 */
	public SiegeAvion creerPlace(int s) {
		// TODO - implement CreateurSiegeAvion.creerPlace
		throw new UnsupportedOperationException();
	}

}