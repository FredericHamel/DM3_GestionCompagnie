package Domaine.Voyages.Composants;
import java.util.*;
import Domaine.Voyages.Visiteur.*;


public class CompagnieTrain extends Compagnie {

	
	public CompagnieTrain(String nom, String Id){
		super(nom, Id);
	}
	
	/**
	 * 
	 * @param IDCompagnie
	 * @param IDVoyage
	 * @param prix
	 * @param liste
	 */
	public void creerSection(String IDCompagnie, String IDVoyage, float prix, ArrayList<Integer> liste) {
		// TODO - implement CompagnieTrain.creerSection
		throw new UnsupportedOperationException();
	}

	public void supprimerToutesDescriptions() {
		// TODO - implement CompagnieTrain.supprimerToutesDescriptions
		throw new UnsupportedOperationException();
	}

	public void creerDisposition() {
		// TODO - implement CompagnieTrain.creerDisposition
		throw new UnsupportedOperationException();
	}
	
	public void accept(Visitor v){
		
	}

}