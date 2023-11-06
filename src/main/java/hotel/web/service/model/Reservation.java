package hotel.web.service.model;

import java.time.LocalDate;

public class Reservation {
		/* ATTRIBUTES */
	private static int count =0;
	private final int id;
	private String nom;
	private String prenom;
	private LocalDate date_arrive;
	private LocalDate date_depart;
	private Chambre chambre;
	private int nbr_telephone;


	
		/* CONSTRUCTOR */
	public Reservation(String nom, String prenom, LocalDate date_arrive, LocalDate date_depart, Chambre chambre, int nbr_telephone) {// avec agence
		this.nom = nom;
		this.prenom = prenom;
		this.date_arrive = date_arrive;
		this.date_depart = date_depart;
		this.nbr_telephone= nbr_telephone;
		this.id = count;
		count++;
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
	public LocalDate getDate_arrive() {
		return date_arrive;
	}
	public LocalDate getDate_depart() {
		return date_depart;
	}
	public Chambre getChambre() {
		return chambre;
	}

	public int getNbr_telephone() {
		return nbr_telephone;
	}
	public int getId() {
		return id;
	}

}
