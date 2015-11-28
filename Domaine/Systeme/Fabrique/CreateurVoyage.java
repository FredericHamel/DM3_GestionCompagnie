package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;

public interface CreateurVoyage {

	/**
	 * 
	 * @param d
	 * @param c
	 * @param dateDepart
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 */
	Voyage creerVoyage(Description d, Date c, Date dateDepart, Time dateArrivee, Time heureDepart, Float heureArrive);

}