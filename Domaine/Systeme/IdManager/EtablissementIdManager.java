package Domaine.Systeme.IdManager;

public class EtablissementIdManager extends IdManager {

	private static EtablissementIdManager instance = new EtablissementIdManager();
	
	public static EtablissementIdManager getInstance() {
		// TODO - implement EtablissementIdManager.getInstance		
		if(instance == null){
			instance = new EtablissementIdManager();
		}
		return instance;
	}

	public String generateID() {
		// TODO - implement EtablissementIdManager.generateID
		throw new UnsupportedOperationException();
	}

}