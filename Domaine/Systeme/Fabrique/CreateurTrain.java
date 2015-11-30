package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;
import java.util.*;

public class CreateurTrain {

	private static CreateurTrain instance;

	private CreateurTrain CreateurTrain() {
		// TODO - implement CreateurTrain.CreateurTrain
		throw new UnsupportedOperationException();
	}

	public static CreateurTrain getInstance() {
		if(instance == null){
			instance = new CreateurTrain();
		}
		return instance;
	}

	/**
	 * 
	 * @param d
	 * @param c
	 * @param dateDepart
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 */
	public Train creerVoyage(Description d, Date c, Date dateDepart, Date dateArrivee, Date heureDepart, float heureArrive) {
		// TODO - implement CreateurTrain.creerVoyage
		throw new UnsupportedOperationException();
	}

}