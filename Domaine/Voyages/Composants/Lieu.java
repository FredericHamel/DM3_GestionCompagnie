package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import Domaine.Transport.Section.Section;
import java.util.*;
import java.util.Calendar;

public abstract class Lieu extends Leaf implements IVisitable {

	protected String uniqueID;
	protected String nom;
	protected String ville;

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v) {
		// TODO - implement Lieu.accept
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param uniqueID_V
	 * @param dateDepart
	 * @param heureDepart
	 * @param heureArrivee
	 * @param prix
	 * @param section
	 */
	public String accept(Visitor v, String uniqueID_V, Date dateDepart, Date heureDepart, Date heureArrivee, float prix, Section section) {
		// TODO - implement Lieu.accept
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param uniqueID_C
	 * @param numero
	 */
	public String accept(Visitor v, String uniqueID_C, String numero) {
		// TODO - implement Lieu.accept
		throw new UnsupportedOperationException();
	}

}
