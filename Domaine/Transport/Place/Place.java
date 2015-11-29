package Domaine.Transport.Place;

import Domaine.Voyages.Composants.*;
import Domaine.Voyages.Visiteur.*;
import Domaine.Transport.Section.*;
import java.util.*;

public abstract class Place extends Leaf implements IVisitable {

	protected Section place;
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
	public ArrayList<Place> changerClasse(Section classe) {
		// TODO - implement Place.changerClasse
		throw new UnsupportedOperationException();
	}

	public float getPrix() {
		// TODO - implement Place.getPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v) {
		// TODO - implement Place.accept
		throw new UnsupportedOperationException();
	}


}