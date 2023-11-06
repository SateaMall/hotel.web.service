package hotel.web.service.model;

import java.time.LocalDate;

public class Reservation {
		/* ATTRIBUTES */
	private String nom;
	private String prenom;
	private double prix_paye;
	private LocalDate date_arrive;
	private LocalDate date_depart;
	private Chambre chambre;

	
		/* CONSTRUCTOR */
	public Reservation(String nom, String prenom, LocalDate date_arrive, LocalDate date_depart, Chambre chambre, double reduc) {// avec agence
		this.nom = nom;
		this.prenom = prenom;
		this.date_arrive = date_arrive;
		this.date_depart = date_depart;
		prix_paye=chambre.getPrix_base()-reduc; //Prix avec reduc
	}
	
	/* METHODES */
	public boolean dateOverlap(LocalDate dep,LocalDate arv) {
		Reservation r1=this;
		if (!(dep.isBefore(r1.date_arrive) || arv.isAfter(r1.date_depart))) {
            return true;  //La chambre n'est pas disponible
        }
		return false;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getPrix_paye() {
		return prix_paye;
	}
	
	
	public LocalDate getDate_arrive() {
		return date_arrive;
	}

	public LocalDate getDate_depart() {
		return date_depart;
	}

	public Chambre getChambre() {
		return chambre;
	}

}
