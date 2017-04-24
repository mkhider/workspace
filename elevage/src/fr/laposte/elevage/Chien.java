package fr.laposte.elevage;

public class Chien extends Mammifere {
	int nbPattes = 4;
	String nom;
	String race;
	String type;
	String affecter = "non";
	
	public Chien(String nom, String race, String type) {
		super();
		this.nom = nom;
		this.race = race;
		this.type = type;
	}

	public void sExprimer(){
		System.out.println("je suis " + this.nom + " un chien de race: " + this.race + " et de type: " + this.type);
	}
	
	public void seDeplacer(){
		System.out.println("Je cours !");
	}

	public String getNom() {
		return nom;
	}

	public String getRace() {
		return race;
	}

	public String getType() {
		return type;
	}

	public String getAffecter() {
		return affecter;
	}

	public void setAffecter(String affecter) {
		this.affecter = affecter;
	}
	

	
}
