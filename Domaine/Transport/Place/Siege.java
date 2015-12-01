package Domaine.Transport.Place;

import Domaine.Transport.Section.*;
import java.util.*;

public abstract class Siege extends Place {

	protected boolean aile;
	protected boolean fenetre;
	
	protected Siege(String numero, Section place) {
    	super(numero, place);
    }

	public void connaitreDisposition() {
		// TODO - implement Siege.connaitreDisposition
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 * @param classe
	 */
	public ArrayList<Place> changerClasse(Section classe) {
		// TODO - implement SiegeAvion.changerClasse
		throw new UnsupportedOperationException();
	}

}