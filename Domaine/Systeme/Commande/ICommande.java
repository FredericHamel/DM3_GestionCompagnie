package Domaine.Systeme.Commande;

public abstract interface ICommande {

	void execute();

	void undo();

}