package hotel.web.service.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Reservation;
import jakarta.jws.WebService;

@WebService(endpointInterface="hotel.web.service.services.HotelService")
public class HotelServiceImpl implements HotelService{
	
		/* ATTRIBUTES */
	private Hotel hotel;
	
	
		/* CONSTRUCTOR */
	public HotelServiceImpl(Hotel hotel) {
		this.hotel=hotel;
	}
	
	
		/* METHODES */
	public ArrayList<Chambre> getChambresDispo(int id, String mdp, LocalDate date_deb, LocalDate date_fin, int nbrPersonne) throws NoRoomFoundException, LoginIdentificationBadException {
		 ArrayList<Chambre> chambresDispo= new ArrayList<>();
		if(!signIn(id,mdp)) {throw new LoginIdentificationBadException(); }
		for(Chambre c: hotel.getChambres())
		{
			boolean chambreDisponible = true;
			for(Reservation r: c.getReservations()) {
                if (!r.dateOverlap(date_deb,date_fin)) {
                    chambreDisponible = false;
                    break; //La chambre n'est pas disponible
                }
			}
			if(chambreDisponible) {chambresDispo.add(c);}
		}
        if (chambresDispo.isEmpty()) {
            throw new NoRoomFoundException(); // Aucune chambre n'est disponible
        }
        return chambresDispo;
	}
	
	public Adresse returnHotelAdr() {
		return hotel.getAdresse();
	}
	
	public Hotel returnHotel() {
		return hotel;
	}

	public 	String Connectiontest(String message) {
		System.out.println(message);
		return message+"\n"+ "Thank you for sending us a message" ;
	}
	
	public boolean signIn(int id, String mdp) {
		Map<Integer,String> agences= hotel.getAgences();
		  if (agences.containsKey(id)) {
	            String storedPassword = agences.get(id);
	            if (storedPassword.equals(mdp)) {
	                return true; //L'utilisateur est authentifié avec succès
	            }
	        }
	        return false; // L'utilisateur n'existe pas
	    }
	}


