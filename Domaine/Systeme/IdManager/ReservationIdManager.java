package Domaine.Systeme.IdManager;

public class ReservationIdManager{
	
	private static ReservationIdManager instance = new ReservationIdManager();

	public static ReservationIdManager getInstance() {
		// TODO - implement ReservationIdManager.getInstance
		if(instance == null){
			instance = new ReservationIdManager();
		}
		return instance;
	}

	public String generateID() {
		// TODO - implement ReservationIdManager.generateID
		throw new UnsupportedOperationException();
	}

}