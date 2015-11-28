package Domaine.Systeme.Fabrique;

import Domaine.Transport.Disposition.*;
import Domaine.Transport.Section.*;

public interface CreateurDisposition {

	/**
	 * 
	 * @param s
	 */
	Disposition creerDisposition(ISection s);

}