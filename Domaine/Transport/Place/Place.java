package Domaine.Transport.Place;

import Domaine.Voyages.Composants.*;
import Domaine.Voyages.Visiteur.*;
import Domaine.Transport.Section.*;

public abstract class Place extends Leaf implements IVisitable {

	protected ISection place;
	protected String numero;

	public void annuler() {
		// TODO - implement Place.annuler
		throw new UnsupportedOperationException();
	}

	public void confirmer() {
		// TODO - implement Place.confirmer
		throw new UnsupportedOperationException();
	}

	public void reserver() {
		// TODO - implement Place.reserver
		throw new UnsupportedOperationException();
	}

	public boolean estReserve() {
		// TODO - implement Place.estReserve
		throw new UnsupportedOperationException();
	}

	public boolean estConfirme() {
		// TODO - implement Place.estConfirme
		throw new UnsupportedOperationException();
	}

	public String getVoyageID() {
		// TODO - implement Place.getVoyageID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param classe
	 */
	public List<Place> changerClasse(Section classe) {
		// TODO - implement Place.changerClasse
		throw new UnsupportedOperationException();
	}

	public Float getPrix() {
		// TODO - implement Place.getPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public boolean accept(Visitor v) {
		// TODO - implement Place.accept
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
	 * @param sigle
	 * @param parameter
	 */
	public String accept(Visitor v, String uniqueID_C, String numero, String uniqueID_V, Date dateDepart, Time heureDepart, Time heureArrivee, float prix, char sigle, float parameter) {
		// TODO - implement Place.accept
		throw new UnsupportedOperationException();
	}

}