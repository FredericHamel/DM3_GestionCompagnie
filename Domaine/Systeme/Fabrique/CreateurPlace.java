package Domaine.Systeme.Fabrique;

import Domaine.Transport.Place.*;
import Domaine.Transport.Section.*;

public interface CreateurPlace {

	/**
	 * 
	 * @param s
	 */
	Place creerPlace(ISection s);

}