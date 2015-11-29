package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;
import java.util.*;

public class CreateurDescriptionCroisiere implements CreateurDescription {

	private static CreateurDescriptionCroisiere instance;

	private CreateurDescriptionCroisiere CreateurDescriptionCroisiere() {
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
	public DescriptionCroisiere creerDescription(Compagnie co, ArrayList<Lieu> lieux, String jourDepart, Date duree) {
		// TODO - implement CreateurDescriptionCroisiere.creerDescription
		throw new UnsupportedOperationException();
	}

}