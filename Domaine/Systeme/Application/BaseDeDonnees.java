package Domaine.Systeme.Application;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Observateur.*;
import java.util.*;
import Domaine.Volet_Client.*;

public class BaseDeDonnees extends Composite implements ISujetBDDCoteClient, ISujetBDDCoteAdmin {

	private Collection<Reservation> reservation;
	private Collection<Compagnie> compagnie;
	Collection<Voyage> voyage;
	Collection<Description> description;
	private Time etatClient;
	private Time etatAdmin;
	private static BaseDeDonnees instance;

	public Time getStateClient() {
		// TODO - implement BaseDeDonnees.getStateClient
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 */
	public void setStateClient(java.util.Date s) {
		// TODO - implement BaseDeDonnees.setStateClient
		throw new UnsupportedOperationException();
	}

	public static BaseDeDonnees getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param s
	 */
	public void setStateAdmin(java.util.Date s) {
		// TODO - implement BaseDeDonnees.setStateAdmin
		throw new UnsupportedOperationException();
	}

	public Time getStateAdmin() {
		// TODO - implement BaseDeDonnees.getStateAdmin
		throw new UnsupportedOperationException();
	}

}