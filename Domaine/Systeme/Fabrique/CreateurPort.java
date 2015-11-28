package Domaine.Systeme.Fabrique;

public class CreateurPort implements CreateurLieu {

	private static CreateurPort instance;

	private CreateurPort CreateurPort() {
		// TODO - implement CreateurPort.CreateurPort
		throw new UnsupportedOperationException();
	}

	public static CreateurPort getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	public Port creerLieu(String nom, String ville) {
		// TODO - implement CreateurPort.creerLieu
		throw new UnsupportedOperationException();
	}

}