package Domaine.Voyages.Visiteur;

import Domaine.Transport.Section.*;
import java.util.*;

public class StructureDeDonnees {

	private IVisitable elements;
	private String uniqueID_C;
	private String numero;
	private String uniqueID_V;
	private Date dateDepart;
	private Date heureDepart;
	private Date heureArrivee;
	private float prix;
	private Section section;

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v) {
		// TODO - implement StructureDeDonnees.accept
		throw new UnsupportedOperationException();
	}

}