package hotel.web.service.model;

public class Adresse {
		/* ATTRIBUTES */
	private String pays;
	private String ville;
	private String rue;
	private String lieu_dit;
	private String position_gps;
	private int code_postale;

	
		/* CONSTRUCTOR */
	public Adresse(String pays, String ville, String rue, String lieu_dit, String position_gps, int code_postale) {
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.lieu_dit = lieu_dit;
		this.position_gps = position_gps;
		this.code_postale = code_postale;
	}
	
		/* METHODES */
	public String getPays() {
		return pays;
	}
	
	public String getVille() {
		return ville;
	}
	
	public String getRue() {
		return rue;
	}
	
	public String getLieu_dit() {
		return lieu_dit;
	}
	
	
	public String getPosition_gps() {
		return position_gps;
	}
	
	public int getCode_postale() {
		return code_postale;
	}

}
