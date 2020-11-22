package helloarray;

import java.util.HashMap;
import java.util.Map;

public class DictionnairesOuMaps {

    private static final String kjune = "June";
    private static final String kseptember = "September";
    private static final String kmarch = "March";

    public static void main(String[] args) {
        dictionnaireMapTest();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        dictionnaireMapTestTwo();
    }

    public static void dictionnaireMapTest() {
        Map<String, Integer> mapDeString = new HashMap<String, Integer>();
        mapDeString.put("Jacky", 42);
        mapDeString.put("Lou2Mer", 36);
        mapDeString.put("Jessye", 35);
        System.out.println(mapDeString);
        System.out.println(mapDeString.get("Lou2Mer"));
        mapDeString.put("Tesdy", 36);
        System.out.println("SIZE : " + mapDeString.size());
        System.out.println("KEYSET : " + mapDeString.keySet());
        System.out.println("VALUES : " + mapDeString.values());
        System.out.println("containsKey('Tesdy') => " + mapDeString.containsKey("Tesdy"));
        System.out.println("containsKey('Leemoo') => " + mapDeString.containsKey("Leemoo"));
        System.out.println("PUTIFABSENT(\"Leemoo\", 36) : " + mapDeString.putIfAbsent("Leemoo", 36));
        System.out.println("containsKey('Leemoo') => " + mapDeString.containsKey("Leemoo"));
        System.out.println("SIZE : " + mapDeString.size());
    }

    private static void dictionnaireMapTestTwo() {
        Map<String, Integer> months = new HashMap <String, Integer>();

        //TODO Remplacer les variables par des constantes
        months.put(kjune, 6);
        months.put(kseptember, 9);
        months.put(kmarch, 5);

        //TODO Corriger "march" (mars) par sa vraie valeur (3)
        months.put(kmarch, 3);

        //TODO Supprimer "june" (juin)
        months.remove(kjune);

        //Affiche le contenu du dictionnaire
        System.out.println("Voici les mois qui nous intéressent : ");
        for (Map.Entry<String, Integer> month : months.entrySet()){
            System.out.println(month.getKey() + " est le mois numéro " + month.getValue() + " de l'année, ");
        }
    }
}
