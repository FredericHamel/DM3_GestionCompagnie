package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Fabrique.*;
import Domaine.Systeme.Application.*;
import java.util.*;

public class CreerDescriptionCommande extends CreerCommande {

	private Compagnie co;
	private String jourDepart;
	private int duree;
	private ArrayList<Lieu> lieux;
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
	public CreerDescriptionCommande CreerDescriptionCommande(AdministrateurSysteme admin, CreateurDescription c, Compagnie co, String jourDepart, Date duree, ArrayList<Lieu> lieux) {
		// TODO - implement CreerDescriptionCommande.CreerDescriptionCommande
		throw new UnsupportedOperationException();
	}

}