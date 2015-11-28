package Domaine.Paiement;

import Domaine.Volet_Client.*;

public abstract class Paiement {

	private Reservation reservationConfirme;
	protected float montant;

	/**
	 * 
	 * @param info
	 * @param prix
	 */
	public boolean effectuerPaiement(String info, float prix) {
		// TODO - implement Paiement.effectuerPaiement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param info
	 * @param prix
	 */
	public boolean effectuerRemboursement(String info, float prix) {
		// TODO - implement Paiement.effectuerRemboursement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param infos
	 */
	public boolean verifierInformations(String infos) {
		// TODO - implement Paiement.verifierInformations
		throw new UnsupportedOperationException();
	}

}