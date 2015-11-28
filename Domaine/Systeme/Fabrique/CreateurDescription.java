package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;

public abstract interface CreateurDescription {

	/**
	 * 
	 * @param co
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	Description creerDescription(Compagnie co, List<Lieu> lieux, DayOfWeek jourDepart, Time duree);

}