package fr.magasin;

public class Personnage {
	protected String nom;
	protected String planete;
	protected String espece;
	protected String genre;
	protected int prix;
	protected int nbstock;
	
	public Personnage(String nom, String planete, String espece, String genre, int prix, int nbstock) {
		this.nom = nom;
		this.planete = planete;
		this.espece = espece;
		this.genre = genre;
		this.prix = prix;
		this.nbstock = nbstock;
	}

	public int getNbstock() {
		return nbstock;
	}

	public void setNbstock(int nbstock) {
		this.nbstock = nbstock;
	}

	public String getNom() {
		return nom;
	}

	public String getPlanete() {
		return planete;
	}

	public String getEspece() {
		return espece;
	}

	public String getGenre() {
		return genre;
	}

	public int getPrix() {
		return prix;
	}
	
	
}
