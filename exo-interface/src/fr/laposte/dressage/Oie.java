package fr.laposte.dressage;

public class Oie extends Oiseau implements Mouvement{

	private boolean foieGras;
	
	public Oie(String nom) {
		super(nom);
		
	}

	public void gaver(){
		
		this.foieGras = true;
	}

	public boolean isFoieGras() {
		return foieGras;
	}
	

}
