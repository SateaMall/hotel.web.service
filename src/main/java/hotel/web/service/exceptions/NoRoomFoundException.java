package hotel.web.service.exceptions;

public class NoRoomFoundException extends Exception {
	public NoRoomFoundException() {
		
	}
	public NoRoomFoundException(String message) {
		super(message);
	}
}
