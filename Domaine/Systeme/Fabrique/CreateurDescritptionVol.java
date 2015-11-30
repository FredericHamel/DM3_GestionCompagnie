package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;
import java.util.*;

public class CreateurDescritptionVol implements CreateurDescription{

	private static CreateurDescritptionVol instance;

	private CreateurDescritptionVol CreateurDescriptionVol() {
		// TODO - implement CreateurDescritptionVol.CreateurDescriptionVol
		throw new UnsupportedOperationException();
	}

	public static CreateurDescritptionVol getInstance() {
		if(instance == null){
			instance = new CreateurDescritptionVol();
		}
		return instance;
	}

	/**
	 * 
	 * @param co
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public DescriptionVol creerDescription(Compagnie co, ArrayList<Lieu> lieux, String jourDepart, Date duree) {
		// TODO - implement CreateurDescritptionVol.creerDescription
		throw new UnsupportedOperationException();
	}

}