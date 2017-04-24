package fr.laposte.elevage;
import java.util.ArrayList;

public class Elevage {
	private String type;
	
	ArrayList<Chien> listeChien = new ArrayList<>();
	ArrayList<Chenil> listeChenil = new ArrayList<>();
	
	public void remplirChien(){
		listeChien.add(new Chien("Bob", "Setters", "chasse"));
		listeChien.add(new Chien("Lynx", "Labrador", "aveugle"));
		listeChien.add(new Chien("Rex", "Artois", "chasse"));
		listeChien.add(new Chien("Milou", "Basset", "chasse"));
		listeChien.add(new Chien("Omar", "Labrador", "aveugle"));
		listeChien.add(new Chien("Vilain", "Setters", "compagnie"));
		listeChien.add(new Chien("Loulou", "Setters", "agrement"));
		listeChien.add(new Chien("Riri", "Dalmatien", "chasse"));
		listeChien.add(new Chien("titi", "Beagle", "chasse"));
	}
	
	public void remplirChenil(){
		listeChenil.add(new Chenil("A la bonne chasse", "chasse"));
		listeChenil.add(new Chenil("A la bonne vue", "aveugle"));
		listeChenil.add(new Chenil("SPA", "abandonne"));
	}

	public void afficherChenil(){
		
		for (Chenil chenil : listeChenil){
			int nbChien = 0;
			for (Chien chien : listeChien){
				if (chien.getType() == "chasse" && chien.getAffecter() == "non"){
					chien.setAffecter("oui");
					
				}
			}
		}
	}
}
