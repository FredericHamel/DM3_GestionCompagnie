package Domaine.Systeme.Fabrique;

import Domaine.Transport.Place.*;
import Domaine.Transport.Section.*;

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
	public Cabine creerPlace(ISection s) {
		// TODO - implement CreateurCabine.creerPlace
		throw new UnsupportedOperationException();
	}

}