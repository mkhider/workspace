package fr.laposte.dressage;

public class Dresseur extends Personne {
	
	public Dresseur(String nom, String prenom) {
		super(nom,prenom);
		
	}

	public void faireBouger(Mouvement oiseau){
		oiseau.bouger();
	}
	
}
