package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Application.*;
import java.util.*;

public class ModificationVoyageCommande extends ModificationCommande {

	private Voyage v;
	private Date dateDepart;
	private Date dateArrivee;
	private Date heureDepart;
	private Date heureArrive;
	private float prix;

	public void execute() {
		// TODO - implement ModificationVoyageCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement ModificationVoyageCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param v
	 * @param dateDepart
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 * @param prix
	 */
	public ModificationVoyageCommande ModificationVoyageCommande(AdministrateurSysteme admin, Voyage v, Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrive, float prix) {
		// TODO - implement ModificationVoyageCommande.ModificationVoyageCommande
		throw new UnsupportedOperationException();
	}

}