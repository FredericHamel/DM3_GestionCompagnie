package Domaine.Voyages.Visiteur;

import Domaine.Voyages.Composants.*;
import Domaine.Transport.Section.*;
import Domaine.Transport.Place.*;

public interface Visitor {

	/**
	 * 
	 * @param c
	 */
	void visit(Compagnie c);

	/**
	 * 
	 * @param d
	 */
	void visit(Description d);

	/**
	 * 
	 * @param l
	 */
	void visit(Lieu l);

	/**
	 * 
	 * @param v
	 */
	void visit(Voyage v);

	/**
	 * 
	 * @param s
	 */
	void visit(Section s);

	/**
	 * 
	 * @param p
	 */
	void visit(Place p);

}