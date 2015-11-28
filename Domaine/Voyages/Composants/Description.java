package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Section.*;

public abstract class Description extends Leaf implements IVisitable {

	Collection<Voyage> voyage;
	Collection<Lieu> lieux;
	protected String numero;
	protected DayOfWeek jourDepart;
	protected Time duree;

	/**
	 * 
	 * @param date
	 * @param classe
	 */
	public List<Voyage> listerVoyages(Date date, Section classe) {
		// TODO - implement Description.listerVoyages
		throw new UnsupportedOperationException();
	}

	public String getVilleDepart() {
		// TODO - implement Description.getVilleDepart
		throw new UnsupportedOperationException();
	}

	public String getVilleArrive() {
		// TODO - implement Description.getVilleArrive
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param heureDepart
	 * @param uniqueID_C
	 * @param dateDepart
	 * @param numero
	 * @param prix
	 * @param heureArrivee
	 * @param uniqueID_V
	 */
	public String accept(Visitor v, Time heureDepart, String uniqueID_C, Time dateDepart, String numero, ISection prix, float heureArrivee, Date uniqueID_V) {
		// TODO - implement Description.accept
		throw new UnsupportedOperationException();
	}

}