package Domaine.Systeme.IdManager;

public class CompagnieIdManager{

	private static CompagnieIdManager instance = new CompagnieIdManager();
	
	public static CompagnieIdManager getInstance() {
		if(instance == null){
			instance = new CompagnieIdManager();
		}
		return instance;
	}

	public String generateID() {
		// TODO - implement CompagnieIdManager.generateID
		throw new UnsupportedOperationException();
	}

}