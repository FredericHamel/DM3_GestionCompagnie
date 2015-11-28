package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Fabrique.*;

public class CreerDescriptionCommande extends CreerCommande {

	private Compagnie co;
	private DayofWeek jourDepart;
	private Time duree;
	private Liste<Lieu> lieux;
	private CreateurDescription c;

	public void execute() {
		// TODO - implement CreerDescriptionCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CreerDescriptionCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param c
	 * @param co
	 * @param jourDepart
	 * @param duree
	 * @param lieux
	 */
	public CreerDescriptionCommande CreerDescriptionCommande(AdministrateurSysteme admin, CreateurDescription c, Compagnie co, DayOfWeek jourDepart, Time duree, List<Lieu> lieux) {
		// TODO - implement CreerDescriptionCommande.CreerDescriptionCommande
		throw new UnsupportedOperationException();
	}

}