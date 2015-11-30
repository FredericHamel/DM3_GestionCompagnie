package Domaine.Transport.Place;

public abstract class PlaceState {

    private Place p;

	/**
	 * 
	 * @param p
	 */
	protected PlaceState(Place p) {
		this.p = p;
	}

	public abstract void reserver();

	public abstract void confirmer();

	public abstract void annuler();
}
