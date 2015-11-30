package Domaine.Systeme.Fabrique;

public class CreateurCompagnieCroisiere implements CreateurCompagnieCroisiere{

	private static CreateurCompagnieCroisiere instance;

	private CreateurCompagnieCroisiere CreateurCompagnieCroisiere() {
		// TODO - implement CreateurCompagnieCroisiere.CreateurCompagnieCroisiere
		throw new UnsupportedOperationException();
	}

	public static CreateurCompagnieCroisiere getInstance() {
		if(instance == null){
			instance = new CreateurCompagnieCroisiere();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 */
	public CompagnieCroisiere creerCompagnie(String nom) {
		// TODO - implement CreateurCompagnieCroisiere.creerCompagnie
		throw new UnsupportedOperationException();
	}

}