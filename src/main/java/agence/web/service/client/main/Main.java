package agence.web.service.client.main;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
	public static void main(String[] args) {
	try {
	URL url= new URL("http://localhost:8080/seasonsService?wsdl");
	HotelServiceImplService serviceImpl= new HotelServiceImplService(url);
	HotelService proxy= serviceImpl.getHotelServiceImplPort();
	
	System.out.println(proxy.Connectiontest("Hi can you hear me?"));
	} catch(MalformedURLException e) {
		e.printStackTrace();
	}
}
}