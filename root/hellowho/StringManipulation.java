package hellowho;

public class StringManipulation {

    public void stringManipOne() {
        String colorsList = "red, yellow, orange, green, blue";
        String[] colorsListArray = colorsList.split(", ");
        int colorsListLongueur = colorsListArray.length;
        String[] colors = new String[colorsListLongueur];
        //TODO- Remplissez le tableau avec les couleurs demandées
        for(int i = 0; i < colorsListLongueur; i++) {
            colors[i] = colorsListArray[i];
            if (i == 3) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("string1.equals(string2)");
                if(colors[i].equals("green")) {
                    System.out.println("colors[i].equals(\"green\")) : OK OK");
                } else {
                    System.out.println("colors[i].equals(\"green\")) : KO KO");
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("colors[i] == \"green\"");
                if(colors[i] == "green") {
                    System.out.println("colors[i] == \"green\" : OK OK");
                } else {
                    System.out.println("colors[i] == \"green\" : KO KO");
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("colors[i].contains(\"green\")");
                if(colors[i].contains("green")) {
                    System.out.println("colors[i].indexOf(\"green\") != -1: OK OK");
                    System.out.println("colors " + i + " avant => " + colors[i]);
                    //TODO- Remplacez 'green' par 'emerald' dans le tableau
                    colors[3] = "emerald";
                    System.out.println("colors " + i + " après => " + colors[i]);
                } else {
                    System.out.println("colors[i].indexOf(\"green\") != -1: KO KO");
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("colors[i].indexOf(\"green\") != -1");
                if(colors[i].indexOf("emerald") != -1) {
                    System.out.println("colors[i].indexOf(\"emerald\") != -1: OK OK");
                } else {
                    System.out.println("colors[i].indexOf(\"emerald\") != -1: KO KO");
                }

            }
        }
        //Affiche le contenu du tableau
        for(String color:colors){
            System.out.println(color);
        }
    }
}
