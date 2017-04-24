package fr.laposte.bonjour;

public class App { // class nommée App

	public static void main(String[] args) {
		/*on instance un objet de la classe bonjour
		Bonjour hello = new Bonjour("coucou");
		hello.afficherMessage();*/
		Bonjour ola = new Bonjour ();
		
		ola.setMessage("Salut");		
		System.out.println(ola.getMessage());
		
		ola.setMessage("Coucou");		
		System.out.println(ola.getMessage());

		
		
		
		
		// TODO Auto-generated method stub

	}

}
