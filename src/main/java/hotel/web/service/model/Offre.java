package hotel.web.service.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Offre {
	
	
	/*  ATTRIBUTES  */
	private static int count =0;
	private final int id;
	private int capacite;
	private float prix;
	private LocalDate date_arrive;
	private LocalDate date_depart;
	private Chambre chambre;
	
	
	/*  CONSTRUCTOR  */
	public Offre( int capacite, LocalDate date_arrive, LocalDate date_depart, float prix,Chambre chambre) {
		this.id = count;
		this.capacite = capacite;
		this.date_arrive = date_arrive;
		this.date_depart = date_depart;
		this.prix= prix;
		this.chambre= chambre;
		count++;
		}
	
	
	/*  METHODS  */
	public boolean dateOverlap(LocalDate dep,LocalDate arv) {
		Offre O1=this;
		if (!(dep.isBefore(O1.date_arrive) || arv.isAfter(O1.date_depart))) {
            return true;  
        }
		return false;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public int getCapacite() {
		return capacite;
	}
	public LocalDate getDate_arrive() {
		return date_arrive;
	}
	public LocalDate getDate_depart() {
		return date_depart;
	}
	public float getPrix() {
		return prix;
	}


	public Chambre getChambre() {
		return chambre;
	}
	
}
