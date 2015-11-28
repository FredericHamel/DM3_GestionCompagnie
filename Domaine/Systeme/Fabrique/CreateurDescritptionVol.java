package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;

public class CreateurDescritptionVol implements CreateurDescription {

	private static CreateurDescritptionVol instance;

	private com.Administrateur.croisiere.CreateurDescriptionVol CreateurDescriptionVol() {
		// TODO - implement CreateurDescritptionVol.CreateurDescriptionVol
		throw new UnsupportedOperationException();
	}

	public static CreateurDescritptionVol getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param co
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public DescriptionVol creerDescription(Compagnie co, List<Lieu> lieux, DayOfWeek jourDepart, Time duree) {
		// TODO - implement CreateurDescritptionVol.creerDescription
		throw new UnsupportedOperationException();
	}

}