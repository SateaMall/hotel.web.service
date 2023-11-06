package hotel.web.service.exceptions;

public class RoomAlreadyReservedException extends Exception {
	
	public RoomAlreadyReservedException() {
	}
	
	public RoomAlreadyReservedException(String message) {
		super(message);
	}
}
