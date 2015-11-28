package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Section.*;

public abstract class Compagnie extends Composite implements IVisitable {

	private Collection<Description> description;
	protected String nom;
	protected String uniqueID_C;

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

	/**
	 * 
	 * @param v
	 * @param heureArrivee
	 * @param depart
	 * @param arrive
	 * @param heureDepart
	 * @param section
	 */
	public String accept(Visitor v, Time heureArrivee, Lieu depart, Lieu arrive, Time heureDepart, Section section) {
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
	public String accept(Visitor v, String uniqueID_C, String numero, Date uniqueID_V, Time dateDepart, Time heureDepart, float heureArrivee, ISection prix) {
		// TODO - implement Compagnie.accept
		throw new UnsupportedOperationException();
	}

}