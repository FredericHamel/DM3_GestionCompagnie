package Domaine.Systeme.Fabrique;

import Domaine.Transport.Section.*;
import Domaine.Voyages.Composants.*;

public interface CreateurSection {

	/**
	 * 
	 * @param v
	 * @param sd
	 */
	public SectionSimple creerSection(Voyage v, SectionDecorateur sd);

}