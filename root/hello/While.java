package hello;

public class While {

    public void testWhileOne() {
        int nombreDeTour = 0;

        System.out.println("~~~~~~~~~~~~~~~WHILE ONE~~~~~~~~~~~~~~");
        while (nombreDeTour < 10) {
            nombreDeTour++;
            System.out.println("(WHILE ONE) - Tour " + nombreDeTour);
        }
        System.out.println("~~~~~~~~~~~~~~~WHILE OVER~~~~~~~~~~~~~~");
    }
}
