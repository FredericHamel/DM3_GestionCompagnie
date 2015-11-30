package Domaine.Systeme.Fabrique;

public class CreateurCompagnieAerienne{

	private static CreateurCompagnieAerienne instance;

	private CreateurCompagnieAerienne CreateurCompagnieAerienne() {
		// TODO - implement CreateurCompagnieAerienne.CreateurCompagnieAerienne
		throw new UnsupportedOperationException();
	}

	public static CreateurCompagnieAerienne getInstance() {
		if(instance == null){
			instance = new CreateurCompagnieAerienne();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 */
	public CompagnieAerienne creerCompagnie(String nom) {
		// TODO - implement CreateurCompagnieAerienne.creerCompagnie
		throw new UnsupportedOperationException();
	}

}