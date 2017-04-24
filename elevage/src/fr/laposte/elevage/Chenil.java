package fr.laposte.elevage;

public class Chenil {
	private String nom;
	private String specialite;
	private int nombreChien;
	
	public Chenil(String nom, String specialite) {
		super();
		this.nom = nom;
		this.specialite = specialite;
	}
	public int getNombreChien() {
		return nombreChien;
	}
	public void setNombreChien(int nombreChien) {
		this.nombreChien = nombreChien;
	}
	public String getNom() {
		return nom;
	}
	public String getSpecialite() {
		return specialite;
	}
	
	
}
