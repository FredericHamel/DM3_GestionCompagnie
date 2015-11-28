package Domaine.Voyages.Visiteur;

public interface IVisitable {

	/**
	 * 
	 * @param v
	 */
	void accept(Visitor v);

}