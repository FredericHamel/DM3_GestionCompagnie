package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;

public class ModificationVoyageCommande extends ModificationCommande {

	private Voyage v;
	private Date dateDepart;
	private Date dateArrivee;
	private Time heureDepart;
	private Time heureArrive;
	private Float prix;

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
	public ModificationVoyageCommande ModificationVoyageCommande(AdministrateurSysteme admin, Voyage v, Date dateDepart, Date dateArrivee, Time heureDepart, Time heureArrive, Float prix) {
		// TODO - implement ModificationVoyageCommande.ModificationVoyageCommande
		throw new UnsupportedOperationException();
	}

}