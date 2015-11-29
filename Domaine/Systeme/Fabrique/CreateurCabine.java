package Domaine.Systeme.Fabrique;

import Domaine.Transport.Place.*;

public class CreateurCabine implements CreateurPlace {

	private static CreateurCabine instance;

	private CreateurCabine CreateurCabine() {
		// TODO - implement CreateurCabine.CreateurCabine
		throw new UnsupportedOperationException();
	}

	public static CreateurCabine getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param s
	 */
	public Cabine creerPlace(int s) {
		// TODO - implement CreateurCabine.creerPlace
		throw new UnsupportedOperationException();
	}

}