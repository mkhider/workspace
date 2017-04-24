package fr.laposte.dressage;

public class Pingouin extends Oiseau implements Mouvement{

	public Pingouin(String nom) {
		super(nom);
	}

	@Override
	public void bouger() {
		System.out.println("je marche " + this.nom);
	}

}
