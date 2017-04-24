package fr.laposte.airBnb.bean;

public class Logement {
	
	private int id;
	private String description;
	private Proprietaire proprio ;
	private Adresse adresse;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Proprietaire getProprio() {
		return proprio;
	}
	public void setProprio(Proprietaire proprio) {
		this.proprio = proprio;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	

}
