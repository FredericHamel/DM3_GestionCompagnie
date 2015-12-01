package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Section.*;
import java.util.Date;

public abstract class Compagnie extends Composite implements IVisitable {

	private ArrayList<Description> description;
	protected String nom;
	protected String uniqueID_C;

	public Compagnie(String nom, String Id){
		this.nom = nom;
		this.uniqueID_C = Id;
	}
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public String getUniqueID() {
		// TODO - implement Compagnie.getUniqueID
		throw new UnsupportedOperationException();
	}

	public void supprimerToutesDescriptions() {
		// TODO - implement Compagnie.supprimerToutesDescriptions
		throw new UnsupportedOperationException();
	}
	
	public void accept(Visitor v){
		
	}

	/**
	 * 
	 * @param v
	 * @param heureArrivee
	 * @param depart
	 * @param arrive
	 * @param heureDepart
	 * @param section
	 */
	public String accept(Visitor v, Date heureArrivee, Lieu depart, Lieu arrive, Date heureDepart, Section section) {
		// TODO - implement Compagnie.accept
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param uniqueID_C
	 * @param numero
	 * @param uniqueID_V
	 * @param dateDepart
	 * @param heureDepart
	 * @param heureArrivee
	 * @param prix
	 */
	public String accept(Visitor v, String uniqueID_C, String numero, Date uniqueID_V, Date dateDepart, Date heureDepart, float heureArrivee, Section prix) {
		// TODO - implement Compagnie.accept
		throw new UnsupportedOperationException();
	}

}