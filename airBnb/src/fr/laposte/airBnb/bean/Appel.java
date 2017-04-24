package fr.laposte.airBnb.bean;

public class Appel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Disponibilite dispo = new Disponibilite();
		dispo.setId(6);
		dispo.setDatedu("2017-04-10");
		dispo.setDateau("2017-04-20");
		System.out.println(" J'affiche les disponibilités :" +dispo.getId()+ "," + dispo.getDatedu()+ "," + dispo.getDateau());
	}

}
