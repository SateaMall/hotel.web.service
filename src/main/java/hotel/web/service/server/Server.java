package hotel.web.service.server;

import java.time.LocalDate;

import hotel.web.service.model.Adresse;
import hotel.web.service.model.Chambre;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Reservation;
import hotel.web.service.services.HotelServiceImpl;
import jakarta.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		
		Adresse adresse= new Adresse("Germany", "Cologne", "570 Route de Ganges", "Hôtel de 4 seisons","654654,65465 654654,654654 ", 34090);
		
		Hotel hotel= new Hotel("4 Seasons", "Lux",5, adresse);
		
		Chambre c1= new Chambre (1, 2, 200, hotel);
		Chambre c2= new Chambre (2, 2, 200, hotel);
		Chambre c3= new Chambre (3, 2, 200, hotel);
		Chambre c4= new Chambre (4, 2, 200, hotel);
		Chambre c5= new Chambre (5, 2, 200, hotel);
		Chambre c6= new Chambre (6, 1, 150, hotel);
		Chambre c7= new Chambre (7, 1, 150, hotel);
		Chambre c8= new Chambre (8, 1, 150, hotel);
		Chambre c9= new Chambre (9, 1, 150, hotel);
		Chambre c10= new Chambre (10, 1, 150, hotel);
		
		Reservation r1 = new Reservation("Nom1", "Prenom1", LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 5), c1, 10);
        Reservation r2 = new Reservation("Nom2", "Prenom2", LocalDate.of(2023, 11, 6), LocalDate.of(2023, 11, 10), c1,3);
        Reservation r3 = new Reservation("Nom3", "Prenom3", LocalDate.of(2023, 11, 11), LocalDate.of(2023, 11, 15), c1, 5);
        Reservation r4 = new Reservation("Nom4", "Prenom4", LocalDate.of(2023, 11, 16), LocalDate.of(2023, 11, 20), c6,3);
        Reservation r5 = new Reservation("Nom5", "Prenom5", LocalDate.of(2023, 11, 21), LocalDate.of(2023, 11, 25), c6, 15);
        
        c1.addReservation(r1);
        c1.addReservation(r2);
        c1.addReservation(r3);
        c6.addReservation(r4);
        c6.addReservation(r5);
        
        
        
		Endpoint.publish("http://localhost:8080/seasonsService", new HotelServiceImpl(hotel));
		System.out.println("Server is running!");
	}

}
