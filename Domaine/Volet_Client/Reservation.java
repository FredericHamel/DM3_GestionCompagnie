package Domaine.Volet_Client;

import Domaine.Transport.Place.*;
import Domaine.Transport.Section.*;
import java.util.*;

public class Reservation {

	private Place aReserver;
	private String uniqueID;
	private boolean confirme;
	private Date dateAttribution;
	private Date heureAttribution;
	private float tarifAssocie;
	private Date dateD;

	public String getID() {
		// TODO - implement Reservation.getID
		throw new UnsupportedOperationException();
	}

	public float getTarifAssocie() {
		return this.tarifAssocie;
	}

	/**
	 * 
	 * @param date
	 * @param heure
	 */
	public void modifierReservation(Date date, Date heure) {
		// TODO - implement Reservation.modifierReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newAReserver
	 */
	public void setAReserver(Place newAReserver) {
		this.aReserver = newAReserver;
	}

	public void setDateAttribution() {
		// TODO - implement Reservation.setDateAttribution
		throw new UnsupportedOperationException();
	}

	public void setHeureAttribution() {
		// TODO - implement Reservation.setHeureAttribution
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param classe
	 */
	public List<Place> changerClasse(Section classe) {
		// TODO - implement Reservation.changerClasse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param prix
	 */
	public void setPrixAssocie(float prix) {
		// TODO - implement Reservation.setPrixAssocie
		throw new UnsupportedOperationException();
	}

}