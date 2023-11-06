package hotel.web.service.reservation;

import java.time.LocalDate;
import java.util.ArrayList;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.exceptions.RoomAlreadyReservedException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ReservationService {

	/* METHODES */
	@WebMethod
	public int reserver(int id, String mdp, int id_offre, String nom, String pre_nom, int nbr_telephone) throws LoginIdentificationBadException, RoomAlreadyReservedException;

	
}
