package fr.laposte.elevage;

public class Mammifere {
	protected String mamelle;
	protected String sang = "chaud";

	public void enfanter(){
		System.out.println("Je porte mon bébé dans le ventre");
	}
	
	public void sExprimer(){
		System.out.println("son");
	}
	
	public void seDeplacer(){
		System.out.println("comment je bouge");
	}
}
