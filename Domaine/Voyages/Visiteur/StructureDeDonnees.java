package Domaine.Voyages.Visiteur;

public class StructureDeDonnees {

	IVisitable elements;
	private String uniqueID_C;
	private String numero;
	private String uniqueID_V;
	private Date dateDepart;
	private Time heureDepart;
	private Time heureArrivee;
	private float prix;
	private Section3 section;

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v) {
		// TODO - implement StructureDeDonnees.accept
		throw new UnsupportedOperationException();
	}

}