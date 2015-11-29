package Domaine.Systeme.IdManager;

public class VoyageIdManager{

	private static VoyageIdManager instance = new VoyageIdManager();
	
	public static VoyageIdManager getInstance() {
		// TODO - implement VoyageIdManager.getInstance
		if(instance == null){
			instance = new VoyageIdManager();
		}
		return instance;
	}

	public String generateID() {
		// TODO - implement VoyageIdManager.generateID
		throw new UnsupportedOperationException();
	}

}