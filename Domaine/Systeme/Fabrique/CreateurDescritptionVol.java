package Domaine.Systeme.Fabrique;

import Domaine.Voyages.Composants.*;
import java.util.*;

public class CreateurDescritptionVol{

	private static CreateurDescritptionVol instance;

	private CreateurDescriptionVol CreateurDescriptionVol() {
		// TODO - implement CreateurDescritptionVol.CreateurDescriptionVol
		throw new UnsupportedOperationException();
	}

	public static CreateurDescriptionVol getInstance() {
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