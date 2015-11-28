package Domaine.Voyages.Composants;

import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Section.*;
import Domaine.Transport.Place.*;

public abstract class Voyage extends Composite implements IVisitable {

	protected Collection<ISection> section;
	protected Collection<Place> aReserver;
	protected LinkedList<Lieu> listeChaineeLieux;
	protected String uniqueID_V;
	protected Date dateDepart;
	protected Date dateArrivee;
	protected Time heureDepart;
	protected Time heureArrivee;
	protected Float prix;
	protected boolean disponible;

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
	public List<Place> listerPlacesLibres(Section classe) {
		// TODO - implement Voyage.listerPlacesLibres
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param classe
	 */
	public List<Place> listerPlacesTotales(ISection classe) {
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
	public List<Object> accept(Visitor v, Time heureArrivee, ISection section, float prix, Date dateDepart, String uniqueID_V, Time heureDepart) {
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