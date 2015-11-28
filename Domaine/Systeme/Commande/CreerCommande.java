package Domaine.Systeme.Commande;

import Domaine.Voyages.Composants.*;

public abstract class CreerCommande implements ICommande {

	protected Component createdItem;
	protected AdministrateurSysteme admin;

	public void execute() {
		// TODO - implement CreerCommande.execute
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CreerCommande.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 */
	private void setCreatedItem(Component c) {
		this.createdItem = c;
	}

}