package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Application.*;

public abstract class ModificationCommande implements ICommande {

	protected Component modifiedItem;
	protected AdministrateurSysteme admin;

	public void execute() {
		// TODO - implement ModificationCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement ModificationCommande.undo
		throw new UnsupportedOperationException();
	}

}