package Domaine.Transport.Section;

import Domaine.Voyages.Composants.*;

public abstract class Section extends Composite {

	protected char sigle;
	protected Float prix;

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
	private void setPrix(Float prix) {
		this.prix = prix;
	}

	/**
	 * 
	 * @param v
	 * @param uniqueID_C
	 * @param numero
	 */
	public List<Object> accept(Visitor v, float uniqueID_C, ISection numero) {
		// TODO - implement Section.accept
		throw new UnsupportedOperationException();
	}

}