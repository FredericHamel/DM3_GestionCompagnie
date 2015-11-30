package Domaine.Systeme.Fabrique;
import java.util.*;

public class CreateurGare implements CreateurLieu{

	private static CreateurGare instance;

	private CreateurGare CreateurGare() {
		// TODO - implement CreateurGare.CreateurGare
		throw new UnsupportedOperationException();
	}

	public static CreateurGare getInstance() {
		if(instance == null){
			instance = new CreateurGare();
		}
		return instance;
	}

	/**
	 * 
	 * @param nom
	 * @param ville
	 */
	public Gare creerLieu(String nom, String ville) {
		// TODO - implement CreateurGare.creerLieu
		throw new UnsupportedOperationException();
	}

}