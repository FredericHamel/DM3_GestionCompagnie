package Domaine.Systeme.IdManager;

public class DescriptionIdManager extends IdManager {

	public static DescriptionIdManager getInstance() {
		// TODO - implement DescriptionIdManager.getInstance
		if(instance == null){
			instance = new DescriptionIdManager();
		}
		return instance;
	}

	public String generateID() {
		// TODO - implement DescriptionIdManager.generateID
		throw new UnsupportedOperationException();
	}

}