package fr.laposte.heritage;
import java.util.ArrayList;
public class Principale {

	public static void main(String[] args) {
		
		ArrayList<Employe> salaries = new ArrayList<Employe>();
		Employe p01 = new Employe("Jean Dupont", 1543);
		salaries.add(p01);		
		Employe p02 = new Employe("Janine Renard", 1231);
		salaries.add(p02);
		Employe p03 = new Cadre("Serge Petrovic",2100,235);
		salaries.add(p03);
		for (int i = 0 ; i < salaries.size(); i ++){
			System.out.println(salaries.get(i).toString()+"\n");
		}
	}

}
