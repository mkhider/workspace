package fr.plusOuMoins;
import java.util.Scanner;
import java.lang.Math;


public class PlusOuMoins {
	public static void main(String[]args){	
		int nombre;
		int n = (int)(Math.random()*50);
		//int n = 100;

		 do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez un Chiffre : ");
			nombre = sc.nextInt();
			if( nombre > n){
				System.out.println("trop grand");
			}else if( nombre < n){
				System.out.println("trop petit");
			}else{
				System.out.println("ok");	
				
			} 
			sc.close();
		} while (n != nombre);
	}
}
		
	
	