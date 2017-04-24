package pratique;

import java.util.Scanner;

public class Room {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("saisir un mot");
		String str = sc.nextLine();
		System.out.println("ecrire " + str);
	}

}
