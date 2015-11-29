package Domaine.Systeme.Observateur;

import java.util.*;

public interface ISujetBDDCoteClient {

	public ArrayList<IObservateurBDDClient> getClientObservateur();

	/**
	 * 
	 * @param o
	 */
	public void ajouterObservateurClient(IObservateurBDDClient o);

	/**
	 * 
	 * @param o
	 */
	public void supprimerObservateurClient(IObservateurBDDClient o);
	public void notifierClient();

}