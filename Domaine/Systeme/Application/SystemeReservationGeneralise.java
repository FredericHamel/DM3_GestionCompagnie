package Domaine.Systeme.Application;

import Domaine.Systeme.Observateur.*;
import Domaine.Voyages.Composants.*;
import Domaine.Transport.Place.*;
import Domaine.Transport.Section.*;

public class SystemeReservationGeneralise implements IObservateurBDDClient {

	private BaseDeDonnees baseDeDonnees;
	private static SystemeReservationGeneralise instance;

	public static SystemeReservationGeneralise getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param c
	 */
	public void ajouterCompagnie(Compagnie c) {
		// TODO - implement SystemeReservationGeneralise.ajouterCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 */
	public void ajouterDescription(Description d) {
		// TODO - implement SystemeReservationGeneralise.ajouterDescription
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idResa
	 */
	public void effectuerChangement(String idResa) {
		// TODO - implement SystemeReservationGeneralise.effectuerChangement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idResa
	 */
	public void changerDate(String idResa) {
		// TODO - implement SystemeReservationGeneralise.changerDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param aReserver
	 * @param voyage
	 */
	public void reserver(Place aReserver, Voyage voyage) {
		// TODO - implement SystemeReservationGeneralise.reserver
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idResa
	 * @param classe
	 */
	public void changerClasse(String idResa, Section classe) {
		// TODO - implement SystemeReservationGeneralise.changerClasse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idResa
	 */
	public void annulerReservation(String idResa) {
		// TODO - implement SystemeReservationGeneralise.annulerReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param villeD
	 * @param villeA
	 * @param dateD
	 * @param classe
	 */
	public void afficherVoyages(String villeD, String villeA, Date dateD, String classe) {
		// TODO - implement SystemeReservationGeneralise.afficherVoyages
		throw new UnsupportedOperationException();
	}

	public void rafraichirAffichage() {
		// TODO - implement SystemeReservationGeneralise.rafraichirAffichage
		throw new UnsupportedOperationException();
	}

}