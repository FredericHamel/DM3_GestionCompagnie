package Domaine.Systeme.IdManager;

public class CompagnieIdManager{

	private static CompagnieIdManager instance = new CompagnieIdManager();
	private String lastID;
	
	private CompagnieIdManager(){
		this.lastID = "AAA";	
	}
	
	public static CompagnieIdManager getInstance() {
		return instance;
	}

	public String generateID() {
		return "YUL"; //Pour le test seulement; la fonction ne genere pas d'ID autre pour le moment
	}

}