package Domaine.Voyages.Composants;
import java.util.*;
import Domaine.Voyages.Visiteur.*;

public class CompagnieAerienne extends Compagnie {

	
	public CompagnieAerienne(String nom, String Id){
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
		// TODO - implement CompagnieAerienne.creerSection
		throw new UnsupportedOperationException();
	}

	public void supprimerToutesDescriptions() {
		// TODO - implement CompagnieAerienne.supprimerToutesDescriptions
		throw new UnsupportedOperationException();
	}

	public void creerDisposition() {
		// TODO - implement CompagnieAerienne.creerDisposition
		throw new UnsupportedOperationException();
	}
	public void accept(Visitor v){
		
	}

}