package Mystery_Number;
import java.util.Scanner;

public class Mystery_Number {
	
	public static void main(String[] args) {
		playMysteryNumber();
	}
	
	public static void playMysteryNumber() {
		 Scanner scanner = new Scanner(System.in);
	        int MysteryNumber = (int) (Math.random() * 100) + 1;
	        int round = 0;
	        int test;

	        System.out.println("Bienvenue dans le jeu du nombre mystère !");
	        System.out.println("Devinez le nombre entre 1 et 100 :");
	        do {
	            System.out.print("Votre proposition : ");
	             test= scanner.nextInt();
	            round++;

	            if (test < MysteryNumber) {
	                System.out.println("C'est plus !");
	            } else if (test > MysteryNumber) {
	                System.out.println("C'est moins !");
	            } else {
	                System.out.println("Bravo, vous avez trouvé le nombre mystère (" + MysteryNumber + ") en " + round + " essais !");
	            }
	        } while (test != MysteryNumber);

	        scanner.close();

	     
	}

}
