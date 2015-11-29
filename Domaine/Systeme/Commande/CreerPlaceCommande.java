package Domaine.Systeme.Commande;

import Domaine.Systeme.Fabrique.*;

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
	public CreerPlaceCommande CreerPlaceCommande(AdministrateurSysteme admin, CreateurPlaceCommande c, Section s) {
		// TODO - implement CreerPlaceCommande.CreerPlaceCommande
		throw new UnsupportedOperationException();
	}

}