package Domaine.Systeme.Fabrique;

public class CreateurAeroport implements CreateurLieu {

	private static CreateurAeroport instance = new CreateurAeroport();

	private CreateurAeroport CreateurAeroport() {
		// TODO - implement CreateurAeroport.CreateurAeroport
		throw new UnsupportedOperationException();
	}

	public static CreateurAeroport getInstance() {
		if(instance == null){
			instance = new CreateurAeroport();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	public void creerLieu(String nom, String ville) {
		// TODO - implement CreateurAeroport.creerLieu
		throw new UnsupportedOperationException();
	}

}