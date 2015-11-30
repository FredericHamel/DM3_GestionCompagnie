package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import java.util.*;

public class ModificationDescriptionCommande extends ModificationCommande {

	private Description d;
	private List<Lieu> lieux;
	private String jourDepart;
	private Time duree;

	public void execute() {
		// TODO - implement ModificationDescriptionCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement ModificationDescriptionCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param d
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public ModificationDescriptionCommande ModificationDescriptionCommande(AdministrateurSysteme admin, Description d, ArrayList<Lieu> lieux, String jourDepart, Date duree) {
		// TODO - implement ModificationDescriptionCommande.ModificationDescriptionCommande
		throw new UnsupportedOperationException();
	}

}