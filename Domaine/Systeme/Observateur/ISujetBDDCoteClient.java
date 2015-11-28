package Domaine.Systeme.Observateur;

import java.util.*;

public abstract interface ISujetBDDCoteClient {

	Collection<IObservateurBDDClient> getClientObservateur();

	/**
	 * 
	 * @param o
	 */
	void ajouterObservateurClient(IObservateurBDDClient o);

	/**
	 * 
	 * @param o
	 */
	void supprimerObservateurClient(IObservateurBDDClient o);

	void notifierClient();

}