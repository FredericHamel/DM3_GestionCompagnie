package Domaine.Voyages.Composants;
import java.util.*;
import Domaine.Voyages.Visiteur.*;

public class CompagnieCroisiere extends Compagnie {

	
	public CompagnieCroisiere(String nom, String Id){
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
		// TODO - implement CompagnieCroisiere.creerSection
		throw new UnsupportedOperationException();
	}

	public void supprimerToutesDescriptions() {
		// TODO - implement CompagnieCroisiere.supprimerToutesDescriptions
		throw new UnsupportedOperationException();
	}
	
	public void accept(Visitor v){
		
	}

}