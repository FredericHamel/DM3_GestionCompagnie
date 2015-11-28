package Domaine.Transport.Disposition;

import Domaine.Voyages.Composants.*;

public abstract class Disposition extends Leaf {

	protected String disposition;

	/**
	 * 
	 * @param col
	 */
	public String getDisposition(int col) {
		return this.disposition;
	}

	public int getDispositionLength() {
		// TODO - implement Disposition.getDispositionLength
		throw new UnsupportedOperationException();
	}

}