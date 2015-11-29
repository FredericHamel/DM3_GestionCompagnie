package Domaine.Systeme.Fabrique;

import Domaine.Transport.Disposition.*;

public class CreateurDispositionMoyen implements CreateurDisposition {

	private static CreateurDispositionMoyen instance;

	private CreateurDispositionMoyen CreateurDispositionMoyen() {
		// TODO - implement CreateurDispositionMoyen.CreateurDispositionMoyen
		throw new UnsupportedOperationException();
	}

	public static CreateurDispositionMoyen getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param s
	 */
	public DispositionMoyen creerDisposition(int s) {
		// TODO - implement CreateurDispositionMoyen.creerDisposition
		throw new UnsupportedOperationException();
	}

}