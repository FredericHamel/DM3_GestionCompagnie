package Domaine.Systeme.Fabrique;

import Domaine.Transport.Disposition.*;
import Domaine.Transport.Section.*;

public class CreateurDispositionConfort implements CreateurDisposition {

	private static CreateurDispositionConfort instance;

	private CreateurDispositionConfort CreateurDispositionConfort() {
		// TODO - implement CreateurDispositionConfort.CreateurDispositionConfort
		throw new UnsupportedOperationException();
	}

	public static CreateurDispositionConfort getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param s
	 */
	public DispositionConfort creerDisposition(ISection s) {
		// TODO - implement CreateurDispositionConfort.creerDisposition
		throw new UnsupportedOperationException();
	}

}