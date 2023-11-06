package agence.web.service.model;


public class Agence {
	
int id;
private String nom;
private String mdp;
private double taux_reduc;
//public ArrayList<Hotel> hotels= new ArrayList<Hotel>();

public Agence(String nom, double taux_reduc, String mdp) {
	super();
	this.nom = nom;
	this.mdp = mdp;
	this.taux_reduc = taux_reduc;
}

/*
public void addhote(Hotel hotel) {
	hotels.add(hotel);
} 
public ArrayList<Hotel> getHotels() {
	return hotels;
}

public void setHotels(ArrayList<Hotel> hotels) {
	this.hotels = hotels;
}
*/

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public double getTaux_reduc() {
	return taux_reduc;
}

public void setTaux_reduc(double taux_reduc) {
	this.taux_reduc = taux_reduc;
}



}
