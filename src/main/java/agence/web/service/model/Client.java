package agence.web.service.model;

public class Client {
 private String nom;
 private String prenom;
 private String adresse_mail;
 private String portable;
 private String pays;
 private int creditCard;

public Client(String nom, String prenom, String adresse_mail, String portable, String pays, int creditCard) {
	this.nom = nom;
	this.prenom = prenom;
	this.adresse_mail = adresse_mail;
	this.portable = portable;
	this.pays = pays;
	this.creditCard=creditCard;
}

public String getNom() {
	return nom;
}

public String getPrenom() {
	return prenom;
}

public String getAdresse_mail() {
	return adresse_mail;
}

public String getPortable() {
	return portable;
}

public String getPays() {
	return pays;
}

public int getCreditCard() {
	return creditCard;
}

}
