package fr.magasin;

public class Magasin {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		stock.remplirPersonnage();
		stock.etatStock();
		for (PersonnageSW personnage : stock.listePersonnage){
//			if (personnage.getNom().equals("Leia")){
//				System.out.println("");
//				personnage.sePresenter();
//			}
//			if (personnage.getPlanete().equals("Tataouin")){
//				System.out.println("");
//				personnage.sePresenter();
//			}
//			if (personnage.getEspece().equals("clone")){
//				System.out.println("");
//				personnage.sePresenter();
//			}
//			if (personnage.getGenre().equals("feminin")){
//				System.out.println("");
//				personnage.sePresenter();
//			}
			if (personnage.getPrix() == 27){
				System.out.println("");
				personnage.sePresenter();
			}
//			if (personnage.getNbstock() == 10){
//				System.out.println("");
//				personnage.sePresenter();
//			}
		}
	}
}
