package hello;

public class ForOne {

    int[] myFirstArray = new int[] {7, 2, 5};

    public void firstArrayTest() {
        System.out.println("~~~~~~~~~~~~~~~FOR ONE~~~~~~~~~~~~~~");
        for(int i = 0; i < myFirstArray.length; i++) {
            System.out.println("For One " + myFirstArray[i]);
            System.out.println("ICI on a accès à l'index : " + i);
        }
        System.out.println("~~~~~~~~~~~~~~~FOR TWO~~~~~~~~~~~~~~");
        for (int j : myFirstArray) {
            System.out.println("For Two " + j);
        }
        System.out.println("ICI on a pas accès à l'index :( ");
        System.out.println("~~~~~~~~~~~~~~~FOR END~~~~~~~~~~~~~~");
    }
}
