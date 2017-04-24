package fr.laposte.concession;

public class Voiture {
	private String marque;
	private String couleur;
	private int annee;
	public Voiture(String marque, String couleur, int annee) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.annee = annee;
	}
		public void seDefinir() {
			
			System.out.println("je suis une :" +this.marque+" "+this.couleur+" "+this.annee);
		
			
		}
	}
	
	


