package Domaine.Systeme.Fabrique;

import Domaine.Transport.Place.*;

public class CreateurCabine {

	private static CreateurCabine instance = new CreateurCabine();

	private CreateurCabine CreateurCabine() {
		if(instance == null){
			instance = new CreateurCabine();
		}
		return instance;
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