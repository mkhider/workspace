package fr.simplon.librairie;

public class Livre {
	private String isbn;    //déclaration des propriétés des livres
	private String auteur;
	private String titre;
	private int prix;
	
	public Livre(String isbn, String auteur, String titre, int prix) { // constructeur
		super();
		this.isbn = isbn;
		this.auteur = auteur;
		this.titre = titre;
		this.prix = prix;
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	}

	
	
	
