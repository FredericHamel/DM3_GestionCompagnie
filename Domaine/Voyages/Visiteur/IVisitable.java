package Domaine.Voyages.Visiteur;

public interface IVisitable {

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v);

}