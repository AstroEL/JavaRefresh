import java.util.Scanner;

public class MySweetProgram {
	static Scanner sc = new Scanner(System.in);
	static String password = "AdamondiAhman";
	
	public static void main(String[] args) {	
		greeting();	
	}
	
	private static void greeting() {
		String guess;
		do {
			System.out.println("Hola Mundo");
			System.out.println("Guess my password, fool.");
			System.out.println("...");	
			guess = sc.next();
		}
		while (!guess.toLowerCase().equals(password.toLowerCase())); 
		System.out.println("Congrats! You made it!");
	}

}
