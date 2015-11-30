package Domaine.Systeme.Fabrique;

import Domaine.Transport.Section.*;
import Domaine.Voyages.Composants.*;

public class CreateurSectionDecoree{

	private static CreateurSectionDecoree instance;

	private CreateurSectionDecoree CreateurSectionDecoree() {
		// TODO - implement CreateurSectionDecoree.CreateurSectionDecoree
		throw new UnsupportedOperationException();
	}

	public static CreateurSectionDecoree getInstance() {
		if(instance == null){
			instance = new CreateurSectionDecoree();
		}
		return instance;
	}

	/**
	 * 
	 * @param v
	 * @param sd
	 * @param c
	 */
	public SectionDecorateur creerSection(Voyage v, SectionDecorateur sd, int c) {
		// TODO - implement CreateurSectionDecoree.creerSection
		throw new UnsupportedOperationException();
	}

}