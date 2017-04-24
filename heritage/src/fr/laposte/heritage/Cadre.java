package fr.laposte.heritage;

public class Cadre extends Employe {
	//variable d'instance
	private double prime;
	//constructeur d'initialisation
	public Cadre(String pNom ,double pSalaire, double Pprime){
		super(pNom, pSalaire);
		prime = Pprime;
	}
	public double getPrime() {
		return prime;
	}
	@Override
	public double getSalaire() {
		
		return super.getSalaire() + prime;
	}
	@Override
	public String toString() {
		
		return "Cadre [nom = " + super.getNom()+ "salaire ="+ this.getSalaire()+"]";
	}
		
	}

	
	