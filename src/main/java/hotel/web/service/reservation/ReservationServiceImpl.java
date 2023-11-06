package hotel.web.service.reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.exceptions.RoomAlreadyReservedException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.model.Reservation;
import jakarta.jws.WebService;

@WebService(endpointInterface="hotel.web.service.reservation.ReservationService")
public class ReservationServiceImpl implements ReservationService {


	/* ATTRIBUTES */
private Hotel hotel;


	/* CONSTRUCTOR */
public ReservationServiceImpl() {}


	/* METHODES */
public int reserver(int id, String mdp, int id_offre, String nom, String pre_nom, int nbr_telephone) throws LoginIdentificationBadException, RoomAlreadyReservedException {
	if(!signIn(id,mdp)) {throw new LoginIdentificationBadException(); }
	Offre of= hotel.getOffre(id);
	Chambre c = of.getChambre();
	for(Reservation r: c.getReservations()) {
        if (r.dateOverlap(of.getDate_arrive(),of.getDate_arrive())) {  	
        	throw new RoomAlreadyReservedException(); // Aucune chambre n'est disponible
        }
	}
	Reservation r = new Reservation(nom, pre_nom, of.getDate_arrive(), of.getDate_arrive(), c, nbr_telephone);
	c.addReservation(r);
	return nbr_telephone;
	

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
                return true; //L'utilisateur est authentifi� avec succ�s
            }
        }
        return false; // L'utilisateur n'existe pas
    }



}


