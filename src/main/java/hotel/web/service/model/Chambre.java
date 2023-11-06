package hotel.web.service.model;

import java.util.ArrayList;

public class Chambre {
		/* ATTRIBUTES */
	private int num_chambre;
	private int capacite;
	private int prix_base;
	private Hotel hotel;
	private ArrayList<Reservation> reservations; 
	
	
		/* CONSTRUCTOR */
	public Chambre(int num_chambre, int capacite, int prix_base, Hotel hotel) {
		super();
		this.num_chambre = num_chambre;
		this.capacite = capacite;
		this.prix_base = prix_base;
		this.hotel = hotel;
		reservations= new ArrayList<>(); ;
	}
	
	
		/* METHODES */
	
	public void addReservation(Reservation r) {
		reservations.add(r);
	}
	public int getNum_chambre() {
		return num_chambre;
	}
	public void setNum_chambre(int num_chambre) {
		this.num_chambre = num_chambre;
	}
	public int getCapacite() {
		return capacite;
	}
	public int getPrix_base() {
		return prix_base;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
}
