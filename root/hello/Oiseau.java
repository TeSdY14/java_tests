package hello;

public class Oiseau extends Animal {

    // POLYMORPHISME de la fonction DEPLACER
    public String deplacer() {
        return super.deplacer("Vole.");
    }

    // POLYMORPHISME de la fonction DEPLACER
    public String deplacer(String mouvement) {
        return super.deplacer(mouvement);
    }
}
