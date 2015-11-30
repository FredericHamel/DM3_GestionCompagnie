package Domaine.Systeme.Application;

import Domaine.Systeme.Observateur.*;
import Domaine.Voyages.Composants.*;
import Domaine.Systeme.Fabrique.*;
import Domaine.Transport.Section.*;
import Domaine.Transport.Disposition.*;
import Domaine.Transport.Place.*;
import java.util.*;

public class AdministrateurSysteme implements IObservateurBDDAdmin {

	private BaseDeDonnees baseDeDonnees;
	private static AdministrateurSysteme instance;

	/**
	 * 
	 * @param d
	 * @param c
	 */
	public void creerVoyage(Description d, CreateurVoyage c) {
		// TODO - implement AdministrateurSysteme.creerVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param c
	 * @param dateDepart
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 * @param prix
	 */
	public void creerVoyage(Voyage v, CreateurSection c, Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrive, float prix) {
		// TODO - implement AdministrateurSysteme.creerVoyage
		throw new UnsupportedOperationException();
	}

	private AdministrateurSysteme() {
		// TODO - implement AdministrateurSysteme.AdministrateurSysteme
		throw new UnsupportedOperationException();
	}

	public static AdministrateurSysteme getInstance() {
		if(instance == null){
			instance = new AdministrateurSysteme();
		}
		return instance;
	}

	/**
	 * 
	 * @param c
	 * @param nom
	 * @param ville
	 */
	public Lieu creerLieu(CreateurLieu c, String nom, String ville) {
		// TODO - implement AdministrateurSysteme.creerLieu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 * @param nom
	 */
	public Compagnie creerCompagnie(CreateurCompagnie c, String nom) {
		// TODO - implement AdministrateurSysteme.creerCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param co
	 * @param c
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public Description creerDescription(Compagnie co, CreateurDescription c, List<Lieu> lieux, String jourDepart, Date duree) {
		// TODO - implement AdministrateurSysteme.creerDescription
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 * @param c
	 * @param dateDepart
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 * @param prix
	 */
	public Voyage creerVoyage(Description d, CreateurSection c, Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrive, float prix) {
		// TODO - implement AdministrateurSysteme.creerVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param sd
	 * @param c
	 */
	public SectionDecorateur creerSection(Voyage v, SectionDecorateur sd, CreateurSection c) {
		// TODO - implement AdministrateurSysteme.creerSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 * @param c
	 */
	public Disposition creerDisposition(Section s, CreateurDisposition c) {
		// TODO - implement AdministrateurSysteme.creerDisposition
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 * @param c
	 */
	public Place creerPlace(Section s, CreateurPlace c) {
		// TODO - implement AdministrateurSysteme.creerPlace
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 */
	public void supprimerDescriptions(Compagnie c) {
		// TODO - implement AdministrateurSysteme.supprimerDescriptions
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param uniqueID
	 */
	public void modifierCompagnie(String nom, String uniqueID) {
		// TODO - implement AdministrateurSysteme.modifierCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param uniqueID
	 */
	public void supprimerCompagnie(String uniqueID) {
		// TODO - implement AdministrateurSysteme.supprimerCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public void verifierDisponibiliteVoyage(Voyage v) {
		// TODO - implement AdministrateurSysteme.verifierDisponibiliteVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param IDCompagnie
	 * @param IDVoyage
	 * @param prix
	 * @param liste
	 */
	public void creerSectionSiege(String IDCompagnie, String IDVoyage, float prix, List<Integer> liste) {
		// TODO - implement AdministrateurSysteme.creerSectionSiege
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param nPrix
	 */
	public void changerPrix(Voyage v, float nPrix) {
		// TODO - implement AdministrateurSysteme.changerPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 */
	public void addChildren(Component c) {
		// TODO - implement AdministrateurSysteme.addChildren
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 */
	public void removeChildren(Component c) {
		// TODO - implement AdministrateurSysteme.removeChildren
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 * @param Nom
	 */
	public void modificationCompagnie(Compagnie c, String Nom) {
		// TODO - implement AdministrateurSysteme.modificationCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l
	 * @param nom
	 * @param ville
	 */
	public void modificationLieu(Lieu l, String nom, String ville) {
		// TODO - implement AdministrateurSysteme.modificationLieu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 * @param lieux
	 * @param jourDepart
	 * @param duree
	 */
	public void modificationDescription(Description d, List<Lieu> lieux, String jourDepart, Date duree) {
		// TODO - implement AdministrateurSysteme.modificationDescription
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 * @param dateDepart
	 * @param dateArrivee
	 * @param heureDepart
	 * @param heureArrive
	 * @param prix
	 */
	public void modificationVoyage(Voyage v, Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrive, float prix) {
		// TODO - implement AdministrateurSysteme.modificationVoyage
		throw new UnsupportedOperationException();
	}
	
	public void mettreAJour(){
		
	}
}