package helloarray;

import java.util.ArrayList;
import java.util.List;

public class arrayListTests {

    public static void main(String[] args) {
        arrayListeTestOne();
    }


    public static void arrayListeTestOne() {
        String bigTabulation = " ~ " + (char) 9 + " ~ " + (char) 9 + " ~ " + (char) 9 + " ~ " + (char) 9;
        List<Integer> listDentier = new ArrayList<Integer>();
        System.out.println("ADD(123) << S'ajoute automatiquement en index 0. ↓↓↓");
        listDentier.add(123);
        System.out.println("a) " + getTaille(listDentier));
        System.out.println(bigTabulation + bigTabulation + bigTabulation + listDentier);
        System.out.println("ADD(987) << S'ajoute automatiquement en index 1. ↓↓↓");
        listDentier.add(987);
        System.out.println("b) " + getTaille(listDentier));
        System.out.println(bigTabulation + bigTabulation + bigTabulation + listDentier);
        System.out.println("SET(0, 852) << Remplace l'index 0 par la nouvelle valeur renseignée. ↓↓↓");
        listDentier.set(0, 852);
        System.out.println("c) " + getTaille(listDentier));
        System.out.println(bigTabulation + bigTabulation + bigTabulation + bigTabulation + listDentier);
        System.out.println("REMOVE(0) << Retire l'élément à l'index 0. ↓↓↓");
        listDentier.remove(0);
        System.out.println("d) " + getTaille(listDentier));
        System.out.println(bigTabulation + bigTabulation + bigTabulation + bigTabulation + listDentier);

        List<String> guests = new ArrayList<String>();
        guests.add("Joey");
        guests.add("Martin");
        guests.add("Marie");
        System.out.println(guests);

    }

    public static String getTaille(List<Integer> arrayInteger) {
        return "Taille de mon arrayList : " + arrayInteger.size() + " : ";

    }
}
