package fr.magasin;

public class PersonnageSW extends Personnage {
	private String pouvoir;
	private String arme;
	private String couleurArme;
	private String couleur;
	private String type;

	public PersonnageSW(String nom, String planete, String espece, String genre, int prix, int nbstock) {
		super(nom, planete, espece, genre, prix, nbstock);
	}

	public PersonnageSW(String nom, String planete, String espece, String genre, int prix, int nbstock, String pouvoir,
			String arme, String couleurArme) {
		super(nom, planete, espece, genre, prix, nbstock);
		this.pouvoir = pouvoir;
		this.arme = arme;
		this.couleurArme = couleurArme;
	}

	public PersonnageSW(String nom, String planete, String espece, String genre, int prix, int nbstock, String couleur,
			String type) {
		super(nom, planete, espece, genre, prix, nbstock);
		this.couleur = couleur;
		this.type = type;
	}
	
	public void sePresenter(){
		System.out.println("Je suis "+ this.nom + " de la planete "+this.planete);
	}

	public String getPouvoir() {
		return pouvoir;
	}
	public String getArme() {
		return arme;
	}
	public String getCouleur() {
		return couleur;
	}
	public String getType() {
		return type;
	}

	public String getCouleurArme() {
		return couleurArme;
	}

	
	
	
}
