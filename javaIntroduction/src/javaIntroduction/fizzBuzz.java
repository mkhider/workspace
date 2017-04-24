package javaIntroduction;

public class fizzBuzz {
	public static void fizz() {
		int test = 80;
		int i;
		for (i = 1; i <= test; i++){
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("fizzBuzz");
			} else if (i % 3 == 0){
				System.out.println("fizz");
			} else if (i % 5 == 0){
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
		

	public static void main(String[]args) {
		fizz();
	}
	
}		
	

