package Domaine.Transport.Section;

import java.util.*;
import Domaine.Transport.Place.*;
import Domaine.Transport.Disposition.*;

public interface ISection {

	Collection<Place> getSection();

	Collection<Disposition> getDisposition();

	String getSigle();

	String getSection();

	float getPrix();

	/**
	 * 
	 * @param v
	 * @param numero
	 * @param uniqueID_C
	 */
	List<Object> accept(Visitor v, ISection numero, float uniqueID_C);

}