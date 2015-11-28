package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;

public class CreateurDescriptionCroisiere implements CreateurDescription {

	private static CreateurDescriptionCroisiere instance;

	private com.Administrateur.croisiere.CreateurDescriptionCroisiere CreateurDescriptionCroisiere() {
		// TODO - implement CreateurDescriptionCroisiere.CreateurDescriptionCroisiere
		throw new UnsupportedOperationException();
	}

	public static CreateurDescriptionCroisiere getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param co
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public DescriptionCroisiere creerDescription(Compagnie co, List<Lieu> lieux, DayOfWeek jourDepart, Time duree) {
		// TODO - implement CreateurDescriptionCroisiere.creerDescription
		throw new UnsupportedOperationException();
	}

}