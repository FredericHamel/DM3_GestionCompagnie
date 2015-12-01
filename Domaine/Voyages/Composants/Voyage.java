package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Section.*;
import Domaine.Transport.Place.*;
import java.util.Date;

public abstract class Voyage extends Composite implements IVisitable {

	protected Collection<Section> section;
	protected Collection<Place> aReserver;
	protected LinkedList<Lieu> listeChaineeLieux;
	protected String uniqueID_V;
	protected Date dateDepart;
	protected Date dateArrivee;
	protected Date heureDepart;
	protected Date heureArrivee;
	protected float prix;
	protected boolean disponible;

	protected Voyage(){
		
	}
	
	public String getVoyageID() {
		// TODO - implement Voyage.getVoyageID
		throw new UnsupportedOperationException();
	}

	public String getInformations() {
		// TODO - implement Voyage.getInformations
		throw new UnsupportedOperationException();
	}

	public Date getDateDepart() {
		return this.dateDepart;
	}

	/**
	 * 
	 * @param classe
	 */
	public ArrayList<Place> listerPlacesLibres(Section classe) {
		// TODO - implement Voyage.listerPlacesLibres
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param classe
	 */
	public ArrayList<Place> listerPlacesTotales(Section classe) {
		// TODO - implement Voyage.listerPlacesTotales
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param heureArrivee
	 * @param section
	 * @param prix
	 * @param dateDepart
	 * @param uniqueID_V
	 * @param heureDepart
	 */
	public void accept(Visitor v) {
		// TODO - implement Voyage.accept
		throw new UnsupportedOperationException();
	}

	public boolean getDisponibilite() {
		// TODO - implement Voyage.getDisponibilite
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 */
	public void setDisponibilite(boolean d) {
		// TODO - implement Voyage.setDisponibilite
		throw new UnsupportedOperationException();
	}

}