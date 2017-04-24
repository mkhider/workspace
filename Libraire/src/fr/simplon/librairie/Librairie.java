package fr.simplon.librairie;

import java.util.ArrayList;

public class Librairie {
	String nom;
	int stock;
	ArrayList<Livre> listeLivre;
	
	public void afficherListe(ArrayList<Livre> listname){
		System.out.println(listname);
		
	}
	
	

	public  void creerListe() {
		ArrayList<Livre>listeLivre = new ArrayList<Livre>();
		
		Livre livre1 = new Livre("3289080", "Leila Slimani", "Chanson douce", 25);
		Livre livre2 = new Livre("4332438", "Gaël Faye", "Petit pays", 32);
		Livre livre3 = new Livre("9067453", "Catherine Cusset", "L'autre qu'on adorait", 19);
		Livre livre4 = new Livre("8976383", "Régis Jauffret", "Cannibales", 12);
		Livre livre5 = new Livre("1234546", "Yasmina Reza", "Babylone", 20);
		Livre livre6 = new Livre("8763903", "Yasmina Reza", "Le Dieu du carnage", 6);
		Livre livre7 = new Livre("5656834", "Simon Liberati", "California girls", 20);
		Livre livre8 = new Livre("5226834", "Ted Chiang", "La tour de Babylone", 9);
		
		listeLivre.add(livre1);
		listeLivre.add(livre2);
		listeLivre.add(livre3);
		listeLivre.add(livre4);
		listeLivre.add(livre5);
		listeLivre.add(livre6);
		listeLivre.add(livre7);
		listeLivre.add(livre8);
		

	}
	public void afficherListe(){
		for (Livre Livre : listeLivre) {
			System.out.println(Livre.getIsbn() + Livre.getAuteur() + Livre.getTitre() + Livre.getPrix());
		}
}
}
