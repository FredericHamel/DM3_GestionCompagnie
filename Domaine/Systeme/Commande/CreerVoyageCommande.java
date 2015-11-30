package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;

import java.util.Date;

import Domaine.Systeme.Application.AdministrateurSysteme;
import Domaine.Systeme.Fabrique.*;

public class CreerVoyageCommande extends CreerCommande {

	private Date dateArrivee;
	private Date heureDepart;
	private Date dateDepart;
	private Description d;
	private float prix;
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
	public CreerVoyageCommande(AdministrateurSysteme admin, Date dateArrivee, Date heureDepart, Date heureArrive, Date dateDepart, Description d, CreateurSection c, float prix) {
		// TODO - implement CreerVoyageCommande.CreerVoyageCommande
		throw new UnsupportedOperationException();
	}

}