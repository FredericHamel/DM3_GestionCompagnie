package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;
import java.util.*;

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
	Voyage creerVoyage(Description d, Date c, Date dateDepart, Date dateArrivee, Date heureDepart, float heureArrive);

}