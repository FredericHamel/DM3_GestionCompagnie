package Domaine.Transport.Place;

import Domaine.Voyages.Composants.*;
import Domaine.Voyages.Visiteur.*;
import Domaine.Transport.Section.*;
import java.util.*;

public abstract class Place extends Leaf implements IVisitable {

	protected Section place;
	protected String numero;
    
    public final PlaceState DISPONIBLE_STATE;
    public final PlaceState RESERVER_STATE;
    public final PlaceState CONFIRMER_STATE;

    private PlaceState curentState;

    protected Place(String numero, Section place) {
        DISPONIBLE_STATE = new DisponibleState(this);
        RESERVER_STATE = new ReserverState(this);
        CONFIRMER_STATE = new ConfirmerState(this);

        setCurrentState(DISPONIBLE_STATE);
        this.numero = numero;
        this.place = place;
    }

    void setCurrentState(PlaceState state)
    {
        this.curentState = state;
    }

	public void annuler() {
		curentState.annuler();
	}

	public void confirmer() {
	    curentState.confirmer();
    }

	public void reserver() {
	    curentState.reserver();
    }

	public boolean estReserve() {
	    return curentState == RESERVER_STATE;
    }

	public boolean estConfirme() {
	    return curentState == CONFIRMER_STATE;
    }

	public String getVoyageID() {
		// TODO - implement Place.getVoyageID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param classe
	 */
	public ArrayList<Place> changerClasse(Section classe) {
		// TODO - implement Place.changerClasse
		throw new UnsupportedOperationException();
	}

	public float getPrix() {
		// TODO - implement Place.getPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v) {
		// TODO - implement Place.accept
		throw new UnsupportedOperationException();
	}


}
