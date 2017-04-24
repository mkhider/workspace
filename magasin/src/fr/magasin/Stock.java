package fr.magasin;
import java.util.ArrayList;

public class Stock {
	
	ArrayList<PersonnageSW> listePersonnage = new ArrayList<>();
	
	public void remplirPersonnage(){
		listePersonnage.add(new PersonnageSW("Luke Skywalker", "Tataouin", "homme", "masculin", 25, 10, "Jedi", "sabre laser", "bleu"));
		listePersonnage.add(new PersonnageSW("Darth Maul", "Dhatum", "homme", "masculin", 27, 9, "Sith", "sabre laser", "rouge"));
		listePersonnage.add(new PersonnageSW("StormTrooper", "Ocean", "clone", "soldat", 20, 5, "noir", "pilote"));
		listePersonnage.add(new PersonnageSW("StormTrooper", "Ocean", "clone", "soldat", 20, 3, "blanc", "pilote"));
		listePersonnage.add(new PersonnageSW("StormTrooper", "Ocean", "clone", "soldat", 20, 4, "noir", "fantassin"));
		listePersonnage.add(new PersonnageSW("StormTrooper", "Ocean", "clone", "soldat", 20, 2, "blanc", "fantassin"));
		listePersonnage.add(new PersonnageSW("Leia", "Alderan", "homme", "feminin", 26, 11));
	}
	
	public void etatStock(){
		int nombreFigurine = 0;
		int nombreLuke = 0;
		int prixLuke = 0;
		int nombreDarth = 0;
		int prixDarth = 0;
		int nombreStormTrooper = 0;
		int prixStorm = 0;
		int nombreLeia = 0;
		int prixLeia = 0;

		for (PersonnageSW personnage : listePersonnage){
			nombreFigurine += personnage.getNbstock();
			if (personnage.getNom().equals("Luke Skywalker")){
				nombreLuke += personnage.getNbstock();
				prixLuke = personnage.prix;
			}
			if (personnage.getNom().equals("Darth Maul")){
				nombreDarth += personnage.getNbstock();
				prixDarth = personnage.prix;
			}
			if (personnage.getNom().equals("StormTrooper")){
				nombreStormTrooper += personnage.getNbstock();
				prixStorm = personnage.prix;
			}
			if (personnage.getNom().equals("Leia")){
				nombreLeia += personnage.getNbstock();
				prixLeia = personnage.prix;
			}
		}
		System.out.println("Dans mon magasin, il y a " + nombreFigurine + " figurines dont :");
		System.out.println(" - " + nombreLuke + " Luke Skywalker, au prix de : " + prixLuke + " euros");
		System.out.println(" - " + nombreDarth + " Darth Maul, au prix de : " + prixDarth + " euros");
		System.out.println(" - " + nombreStormTrooper + " StormTrooper, au prix de : " + prixStorm + " euros");
		System.out.println(" - " + nombreLeia + " Leia, au prix de : " + prixLeia + " euros");
	}
}
