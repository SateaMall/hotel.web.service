package hotel.web.service.services;
import java.time.LocalDate;
import java.util.ArrayList;

import hotel.web.service.exceptions.LoginIdentificationBadException;
import hotel.web.service.exceptions.NoRoomFoundException;
import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface HotelService {
	
	/* METHODES */
	@WebMethod
	ArrayList<Offre> getChambresDispo(int id, String mdp,LocalDate date_deb, LocalDate date_fin, int nbrPersonne) throws NoRoomFoundException, LoginIdentificationBadException;
	
	@WebMethod
	String Connectiontest(String message) ;
	
	@WebMethod
	Adresse returnHotelAdr();
	
	@WebMethod
	Hotel returnHotel();
}
