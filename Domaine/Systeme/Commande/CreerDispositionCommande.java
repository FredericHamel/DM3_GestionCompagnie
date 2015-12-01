package Domaine.Systeme.Commande;

import Domaine.Systeme.Fabrique.*;
import Domaine.Systeme.Application.*;

import Domaine.Transport.Section.Section;

public class CreerDispositionCommande extends CreerCommande {

	private Section s;
	private CreateurDisposition c;

	/**
	 * 
	 * @param s
	 * @param c
	 */
	public void execute(Section s, CreateurDisposition c) {
		// TODO - implement CreerDispositionCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CreerDispositionCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param c
	 * @param s
	 */
	public CreerDispositionCommande CreerDispositionCommande(AdministrateurSysteme admin, CreateurDisposition c, Section s) {
		// TODO - implement CreerDispositionCommande.CreerDispositionCommande
		throw new UnsupportedOperationException();
	}

}