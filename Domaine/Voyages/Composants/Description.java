package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Section.*;
import java.util.Calendar;

public abstract class Description extends Leaf implements IVisitable {

	protected ArrayList<Voyage> voyage;
	protected ArrayList<Lieu> lieux;
	protected String numero;
	protected String jourDepart;
	protected Date duree;

	/**
	 * 
	 * @param date
	 * @param classe
	 */
	public ArrayList<Voyage> listerVoyages(Date date, Section classe) {
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
	public void accept(Visitor v) {
		// TODO - implement Description.accept
		throw new UnsupportedOperationException();
	}

}