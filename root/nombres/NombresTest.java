package nombres;

import java.util.Scanner;

public class NombresTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Combien y a t il d'invités dans votre soirée ?");
        int invites = Integer.parseInt(in.nextLine());
        combienDeTchin(invites);

    }


    private static void getNombreApresVirgule() {

        int nombreInt = 123;
        float nombreFloat = 123.45f;
        double nombreDouble = 123.45645698;

    }

    private static void combienDeTchin(int invites) {
        System.out.println("Avec " + invites + " invités, il y aura " + invites * (invites - 1) / 2 + " *Tchin*, si tout le monde trinque avec tout le monde.");
    }
}
