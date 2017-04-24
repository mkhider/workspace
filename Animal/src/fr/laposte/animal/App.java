package fr.laposte.animal;

public class App {

	public static void main(String[] args) {
		Animal toutou = new Animal("rex", "foxterier" ,30);
		Animal minou = new Animal("mimi", " siamois", 10);
		toutou.seDecrire();
		minou.seDecrire();
		
		
	}

}
