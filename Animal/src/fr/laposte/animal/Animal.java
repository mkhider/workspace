package fr.laposte.animal;

public class Animal {
private String nom;
private String race;
private int taille;
public Animal(String nom, String race, int taille) {
	super();
	this.nom = nom;
	this.race = race;
	this.taille = taille;
}

public void seDecrire(){
	System.out.println(" Je suis un chien: je m'appelle "+this.nom+" " +this.race+" "+this.taille);
}



}
