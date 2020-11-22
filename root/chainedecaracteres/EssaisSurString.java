package chainedecaracteres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class EssaisSurString {

    static final int ASCII_SIZE = 256;

    public static void main(String[] args) {
        /*trouverLeCaractereAvecLePlusDOccurence();
        String chaine = "Bonjour je suis une chaine simple qui sera ordonnée suivant les codes ASCII, donc les majuscules en premier.";
        System.out.println("Voici la chaine à ordonner : " + chaine);
        System.out.println("RÉSULTAT : " + triAlphabeticSimple(chaine));
        System.out.println("RÉSULTAT : " + sortString(chaine));
        System.out.println("RÉSULTAT : " + sortString(chaine, true));*/
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez la chaine à trier (1er, dernier, 2eme, avant-dernier, 3eme ...");
        String motToSort = in.nextLine();
        firstLastFirstLastFirstLast(motToSort);
        firstLastFirstLastFirstLast(motToSort, true);

    }


    private static String triAlphabeticSimple(String chaine) {
        char[] chaineOrdonne = chaine.toCharArray();
        Arrays.sort(chaineOrdonne);

        return new String(chaineOrdonne);
    }

    // Méthode de tri des caractères dans une chaine de caractères
    public static String sortString(String inputString, boolean reverseOrder)
    {
        // Convertir la chaine d'entrée en tableau de character
        Character[] tableauDeCaracteres = new Character[inputString.length()];
        int stringLength = inputString.length();
        for (int i = 0; i < stringLength; i++) {
            tableauDeCaracteres[i] = inputString.charAt(i);
        }
        // Tri alphabétique
        Arrays.sort(tableauDeCaracteres, Comparator.comparingInt(Character::toLowerCase));
        // Tri Alphabétique Inverse
        if(reverseOrder) {
            Collections.reverse(Arrays.asList(tableauDeCaracteres));
        }

        // StringBuilder pour convertir notre tableau Character[] en String
        StringBuilder sb = new StringBuilder(stringLength);
        for (Character caractere : tableauDeCaracteres)
            sb.append(caractere.charValue());

        return sb.toString();
    }

    public static String sortString(String inputString)
    {
        return sortString(inputString, false);
    }

    public static void trouverLeCaractereAvecLePlusDOccurence() {
        Scanner in = new Scanner(System.in);
        System.out.println("Entrer la chaine à analyser : ");
        String words = in.nextLine();
        System.out.println("Vérification de : \"" + words + "\"");

        int[] count = new int[256]; // peut contenir les chiffres et les lettres
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
        int string_len = words.length();
        Map<Character, Integer> map_my = new HashMap<Character, Integer>();

        for (int i = 0; i < string_len; i++) {
            count[words.charAt(i)]++;
            // Pour voir qui vaut quoi :
            map_my.put(words.charAt(i), count[words.charAt(i)]);
        }
        System.out.println(map_my);

        for (int i = 0; i < string_len; i++) {
            if (max < count[words.charAt(i)]) {
                max = count[words.charAt(i)];
                result = words.charAt(i);
            }
        }


        for (int i = 0; i < string_len; i++) {
            if (max < count[words.charAt(i)]) {
                max = count[words.charAt(i)];
                result = words.charAt(i);
            }
        }
        System.out.println(max + " " + result);
    }

    /**
     * Fonction permettant de ranger les caractères d'une chaine en alternant premier, dernier, deuxième, avant-dernier, troisième, avant avant-dernier, etc...
     * @param words String
     */
    public static void firstLastFirstLastFirstLast(String words) {
        firstLastFirstLastFirstLast(words, false);
    }

    /**
     * Fonction permettant de ranger les caractères d'une chaine en alternant premier, dernier, deuxième, avant-dernier, troisième, avant avant-dernier, etc...
     * @param words String
     * @param all boolean
     * Si all = true alors on récupère aussi le caractère au centre dans le cas où la longueur de la chaine soit impaire
     */
    public static void firstLastFirstLastFirstLast(String words, boolean all) {
        int length = words.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < length/2; i++) {
            res.append(words.charAt(i)).append(words.charAt(length - 1 - i));
            if(all && length % 2 != 0 && i == length/2-1) {
                res.append(words.charAt(length / 2));
            }
        }
        System.out.println(res);
    }
}
