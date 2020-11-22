package hello;

import java.util.Scanner;

public class DoWhile {

    public void testDoWhileOne() {
        Scanner in = new Scanner(System.in);
        String userInput;

        System.out.println("~~~~~~~~~~~~~~~DO WHILE ONE~~~~~~~~~~~~~~");
        do {
            System.out.println("(DO WHILE ONE) - Attendre que l'utilisateur quitte.");
            System.out.println("Entrez 'X' pour quitter");
            userInput = in.nextLine().toUpperCase();
        } while (!userInput.contains("X"));

        System.out.println("~~~~~~~~~~~~~~~DO WHILE OVER~~~~~~~~~~~~~~");
    }

}
