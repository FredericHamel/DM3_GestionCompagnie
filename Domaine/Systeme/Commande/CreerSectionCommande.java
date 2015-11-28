package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import Domaine.Transport.Section.*;
import Domaine.Systeme.Fabrique.*;

public class CreerSectionCommande extends CreerCommande {

	private Voyage v;
	private SectionDecorateur sd;
	private CreateurSection c;

	public void execute() {
		// TODO - implement CreerSectionCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CreerSectionCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param admin
	 * @param v
	 * @param sd
	 * @param c
	 */
	public CreerSectionCommande CreerSectionCommande(AdministrateurSysteme admin, Voyage v, SectionDecorateur sd, CreateurSection c) {
		// TODO - implement CreerSectionCommande.CreerSectionCommande
		throw new UnsupportedOperationException();
	}

}