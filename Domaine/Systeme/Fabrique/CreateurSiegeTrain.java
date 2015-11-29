package Domaine.Systeme.Fabrique;

import Domaine.Transport.Place.*;

public class CreateurSiegeTrain implements CreateurPlace {

	private static CreateurSiegeTrain instance;

	private CreateurSiegeTrain CreateurSiegeTrain() {
		// TODO - implement CreateurSiegeTrain.CreateurSiegeTrain
		throw new UnsupportedOperationException();
	}

	public static CreateurSiegeTrain getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param s
	 */
	public SiegeTrain creerPlace(int s) {
		// TODO - implement CreateurSiegeTrain.creerPlace
		throw new UnsupportedOperationException();
	}

}