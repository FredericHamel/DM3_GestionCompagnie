package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Fabrique.*;

public class CreerVoyageCommande extends CreerCommande {

	private Date dateArrivee;
	private Time heureDepart;
	private Date dateDepart;
	private Description d;
	private Float prix;
	private CreateurVoyage c;

	public void execute() {
		// TODO - implement CreerVoyageCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CreerVoyageCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 * @param dateDepart
	 * @param d
	 * @param c
	 * @param prix
	 */
	public CreerVoyageCommande CreerVoyageCommande(AdministrateurSysteme admin, Date dateArrivee, Time heureDepart, Time heureArrive, Date dateDepart, Description d, CreateurSection c, Float prix) {
		// TODO - implement CreerVoyageCommande.CreerVoyageCommande
		throw new UnsupportedOperationException();
	}

}