package Domaine.Systeme.Application;

import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Observateur.*;
import java.util.*;
import Domaine.Volet_Client.*;

public class BaseDeDonnees implements ISujetBDDCoteClient, ISujetBDDCoteAdmin {

	private ArrayList<Reservation> reservation;
	private ArrayList<Compagnie> compagnie;
	ArrayList<Voyage> voyage;
	ArrayList<Description> description;
	private Date etatClient;
	private Date etatAdmin;
	private static BaseDeDonnees instance = new BaseDeDonnees();

	public Date getStateClient() {
		// TODO - implement BaseDeDonnees.getStateClient
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 */
	public void setStateClient(java.util.Date s) {
		// TODO - implement BaseDeDonnees.setStateClient
		throw new UnsupportedOperationException();
	}

	public static BaseDeDonnees getInstance() {
		if(instance == null){
			instance = new BaseDeDonnees();
		}
		return instance;
	}

	/**
	 * 
	 * @param s
	 */
	public void setStateAdmin(java.util.Date s) {
		// TODO - implement BaseDeDonnees.setStateAdmin
		throw new UnsupportedOperationException();
	}

	public Date getStateAdmin() {
		// TODO - implement BaseDeDonnees.getStateAdmin
		throw new UnsupportedOperationException();
	}
	
	public void notifierClient(){
		
	}
	
	public void notifierAdmin(){
		
	}
	
	public void  ajouterObservateurClient(IObservateurBDDClient o ){
		
	}
	
	public void ajouterObservateurAdmin(IObservateurBDDAdmin o ){
		
	}
	
	
	public void supprimerObservateurClient(IObservateurBDDClient o){
		
	}
	
	public void supprimerObservateurAdmin(IObservateurBDDAdmin o ){
		
	}
	
	public ArrayList<IObservateurBDDAdmin> getAdminObservateur(){
		return null;	
	}
	
	public ArrayList<IObservateurBDDClient> getClientObservateur(){
		return null;
	}
}