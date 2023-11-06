package hotel.web.service.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel {
	
		/* ATTRIBUTES */
	private String nom;
	private String category;
	private int etoiles;
	private Adresse adresse;
	private Map<Integer, String> agences = new HashMap<Integer,String>(); //(id,mot de pass)
	
	public ArrayList<Chambre> chambres= new ArrayList<Chambre> ();
	//public ArrayList<Agence> agences= new ArrayList<Agence> ();
	
	
		/* CONSTRUCTOR */
	public Hotel(String nom, String category, int etoiles, Adresse adresse) {
		this.nom = nom;
		this.category = category;
		this.etoiles = etoiles;
		this.adresse = adresse;
	}

	
		/* METHODES */
	public void addChambre(Chambre chambre) {
		chambres.add(chambre);
	}
	
	public Map<Integer, String> getAgences() {
		return agences;
	}


	public void setAgences(Map<Integer, String> agences) {
		this.agences = agences;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getEtoiles() {
		return etoiles;
	}

	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(ArrayList<Chambre> chambres) {
		this.chambres = chambres;
	}

/*	public ArrayList<Agence> getAgences() {
		return agences;
	}

	public void setAgences(ArrayList<Agence> agences) {
		this.agences = agences;
	}
	public void addAgences(Agence agence) {
		agences.add(agence);
	}
	
	*/
	
}
