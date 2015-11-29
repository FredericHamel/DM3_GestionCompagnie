package Domaine.Voyages.Visiteur;

import Domaine.Voyages.Composants.*;
import Domaine.Transport.Section.*;
import Domaine.Transport.Place.*;
import java.util.*;

public interface Visitor {

	/**
	 * 
	 * @param c
	 */
	public void visit(Compagnie c);

	/**
	 * 
	 * @param d
	 */
	public void visit(Description d);

	/**
	 * 
	 * @param l
	 */
	public void visit(Lieu l);

	/**
	 * 
	 * @param v
	 */
	public void visit(Voyage v);

	/**
	 * 
	 * @param s
	 */
	public void visit(Section s);

	/**
	 * 
	 * @param p
	 */
	public void visit(Place p);

}