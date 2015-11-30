package Domaine.Systeme.Fabrique;
import java.util.*;

import Domaine.Voyages.Composants.Compagnie;
import Domaine.Voyages.Composants.CompagnieTrain;

public class CreateurCompagnieTrain implements CreateurCompagnie{

	private static CreateurCompagnieTrain instance;

	private CreateurCompagnieTrain CreateurCompagnieTrain() {
		// TODO - implement CreateurCompagnieTrain.CreateurCompagnieTrain
		throw new UnsupportedOperationException();
	}

	public CreateurCompagnieTrain getInstance() {
		if(instance == null){
			instance = new CreateurCompagnieTrain();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 */
	public Compagnie creerCompagnie(String nom) {
		// TODO - implement CreateurCompagnieTrain.creerCompagnie
		throw new UnsupportedOperationException();
	}

}