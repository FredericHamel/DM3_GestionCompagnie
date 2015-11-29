package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;
import java.util.*;

public interface CreateurDescription {

	/**
	 * 
	 * @param co
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public Description creerDescription(Compagnie co, ArrayList<Lieu> lieux, String jourDepart, Date duree);

}