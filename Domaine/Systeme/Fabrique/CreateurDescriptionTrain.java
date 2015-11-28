package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;

public class CreateurDescriptionTrain implements CreateurDescription {

	private static CreateurDescriptionTrain instance;

	private CreateurDescriptionTrain CreateurDescriptionTrain() {
		// TODO - implement CreateurDescriptionTrain.CreateurDescriptionTrain
		throw new UnsupportedOperationException();
	}

	public static CreateurDescriptionTrain getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param co
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public DescriptionTrain creerDescription(Compagnie co, List<Lieu> lieux, DayOfWeek jourDepart, Time duree) {
		// TODO - implement CreateurDescriptionTrain.creerDescription
		throw new UnsupportedOperationException();
	}

}