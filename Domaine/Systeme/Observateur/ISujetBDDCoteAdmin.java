package Domaine.Systeme.Observateur;

import java.util.*;

public interface ISujetBDDCoteAdmin {

	public ArrayList<IObservateurBDDAdmin> getAdminObservateur();

	/**
	 * 
	 * @param o
	 */
	public void ajouterObservateurAdmin(IObservateurBDDAdmin o);

	/**
	 * 
	 * @param o
	 */
	public void supprimerObservateurAdmin(IObservateurBDDAdmin o);

	public void notifierAdmin();

}