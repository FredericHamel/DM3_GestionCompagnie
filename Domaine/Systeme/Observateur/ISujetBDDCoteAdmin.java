package Domaine.Systeme.Observateur;

import java.util.*;

public abstract interface ISujetBDDCoteAdmin {

	Collection<IObservateurBDDAdmin> getAdminObservateur();

	/**
	 * 
	 * @param o
	 */
	void ajouterObservateurAdmin(IObservateurBDDAdmin o);

	/**
	 * 
	 * @param o
	 */
	void supprimerObservateurAdmin(IObservateurBDDAdmin o);

	void notifierAdmin();

}