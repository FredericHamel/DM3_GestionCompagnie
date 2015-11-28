package Domaine.Systeme.Commande;

import Domaine.Transport.Section.*;
import Domaine.Systeme.Fabrique.*;

public class CreerPlaceCommande extends CreerCommande {

	private ISection s;
	private CreateurPlace c;

	/**
	 * 
	 * @param s
	 * @param c
	 */
	public void execute(ISection s, CreateurPlace c) {
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
	public CreerPlaceCommande CreerPlaceCommande(AdministrateurSysteme admin, CreateurPlaceCommande c, ISection s) {
		// TODO - implement CreerPlaceCommande.CreerPlaceCommande
		throw new UnsupportedOperationException();
	}

}