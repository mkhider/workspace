package fr.laposte.dressage;

public class Oiseau {
	
	protected String nom;

	public Oiseau(String nom) {
		super();
		this.nom = nom;
	}
	
	
	public void bouger(){
		
		System.out.println(" je suis un oiseau:" +this.nom);
	}

}
