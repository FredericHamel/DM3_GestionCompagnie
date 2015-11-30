package Domaine.Transport.Section;

import Domaine.Voyages.Composants.*;
import Domaine.Voyages.Visiteur.*;
import java.util.*;
import Domaine.Transport.Place.*;
import Domaine.Transport.Disposition.*;

public abstract class Section extends Composite {

	protected Collection<Place> section;
	protected Collection<Disposition> disposition;
	protected char sigle;
	protected float prix;

	public String getSigle() {
		// TODO - implement Section.getSigle
		throw new UnsupportedOperationException();
	}

	public String getSection() {
		// TODO - implement Section.getSection
		throw new UnsupportedOperationException();
	}

	public List<Place> listerSieges() {
		// TODO - implement Section.listerSieges
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param prix
	 */
	private void setPrix(float prix) {
		// TODO - implement Section.setPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param uniqueID_C
	 */
	public ArrayList<Object> accept(Visitor v, float uniqueID_C) {
		// TODO - implement Section.accept
		throw new UnsupportedOperationException();
	}

}
