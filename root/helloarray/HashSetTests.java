package helloarray;

import java.util.HashSet;
import java.util.Set;

public class HashSetTests {

    public static void main(String[] args) {

        testsOne();

    }

    public static void testsOne() {
        Set<String> firstHashSet = new HashSet<String>();
        firstHashSet.add("eggs");
        firstHashSet.add("sugar");
        firstHashSet.add("flour");
        firstHashSet.add("chocolat");
        firstHashSet.add("water");
        firstHashSet.add("salt");
        firstHashSet.add("tomate");
        System.out.println(firstHashSet);
        System.out.println("Nombre d'ingrédients : " + firstHashSet.size());
        firstHashSet.remove("tomate");
        System.out.println("Oups petite erreur, correction .... ");
        System.out.println(firstHashSet);
        System.out.println("Nombre d'ingrédients : " + firstHashSet.size());

    }
}
