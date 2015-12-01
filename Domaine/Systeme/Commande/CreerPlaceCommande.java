package Domaine.Systeme.Commande;

import Domaine.Systeme.Application.AdministrateurSysteme;
import Domaine.Systeme.Fabrique.*;
import Domaine.Transport.Section.*;

public class CreerPlaceCommande extends CreerCommande {

	private Section s;
	private CreateurPlace c;

	/**
	 * 
	 * @param s
	 * @param c
	 */
	public void execute(Section s, CreateurPlace c) {
		// TODO - implement CreerPlaceCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CreerPlaceCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param c
	 * @param s
	 */
	public CreerPlaceCommande(AdministrateurSysteme admin, CreateurPlace c, Section s) {
		// TODO - implement CreerPlaceCommande.CreerPlaceCommande
		throw new UnsupportedOperationException();
	}

}