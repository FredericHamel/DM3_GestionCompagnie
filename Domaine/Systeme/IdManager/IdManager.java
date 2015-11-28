package Domaine.Systeme.IdManager;

public abstract class IdManager {

	private static IdManager instance;
	protected String lastID;

	protected IdManager() {
		// TODO - implement IdManager.IdManager
		throw new UnsupportedOperationException();
	}

	public static IdManager getInstance() {
		return this.instance;
	}

	public String generateID() {
		// TODO - implement IdManager.generateID
		throw new UnsupportedOperationException();
	}

}