package fr.laposte.dressage;

public class Proprietaire extends Personne {
	
	private Oie monOie;
	private Pingouin monPingouin;
	private Voiture maVoiture;
	private Dresseur monDresseur;
	public Proprietaire(String nom, String prenom) {
		super(nom, prenom);
		
		this.monOie = new Oie("oieoie");
		this.monPingouin = new Pingouin("pingou");
		this.maVoiture = new Voiture();
		this.monDresseur= new Dresseur("Gerard" ," Dupont");
		
	}
	
	public void bougerPossessions(){
		this.monDresseur.faireBouger(monPingouin);
		this.monDresseur.faireBouger(monOie);
		this.monDresseur.faireBouger(maVoiture);
		
	}
	
	}
	
	


